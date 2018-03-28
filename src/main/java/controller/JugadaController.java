package controller;

import dao.AnimalDAO;
import dao.SorteoDAO;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;
import model.Animal;
import model.Jugada;
import model.Sorteo;
/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 */
@ManagedBean
@ViewScoped
public class JugadaController implements Serializable
{
    private List<Animal> animales;
    private List<Sorteo> sorteos;
    private Animal animal;
    private Sorteo sorteo;
    private List<Sorteo> jugadaSorteos;
    private BigDecimal monto;
    private Jugada jugada;
    private List<Jugada> jugadas;
    
    public JugadaController()
    {
        jugadas = new ArrayList();
    }

    public Sorteo getSorteo()
    {
        return sorteo;
    }

    public void setSorteo(Sorteo sorteo)
    {
        this.sorteo = sorteo;
    }

    public Animal getAnimal()
    {
        return animal;
    }

    public void setAnimal(Animal animal)
    {
        this.animal = animal;
    }

    public List<Sorteo> getJugadasorteos()
    {
        return jugadaSorteos;
    }

    public void setJugadasorteos(List<Sorteo> Jugadasorteos)
    {
        this.jugadaSorteos = Jugadasorteos;
    }
    
        
    public List<Animal> getAnimales()
    {
        AnimalDAO dao = new AnimalDAO();
        this.animales = dao.read("from Animal order by id");
        return this.animales;
    }

    public void setAnimales(List<Animal> animales)
    {
        this.animales = animales;
    }

    public BigDecimal getMonto()
    {
        return monto;
    }

    public void setMonto(BigDecimal monto)
    {
        this.monto = monto;
    }

    public List<Sorteo> getSorteos()
    {
        SorteoDAO dao = new SorteoDAO();
        this.sorteos = dao.read("from Sorteo order by id");
        return this.sorteos;
    }

    public void setSorteos(List<Sorteo> sorteos)
    {
        this.sorteos = sorteos;
    }

    public List<Jugada> getJugadas()
    {
        return jugadas;
    }

    public void setJugadas(List<Jugada> jugadas)
    {
        this.jugadas = jugadas;
    }

    public Jugada getJugada()
    {
        return jugada;
    }

    public void setJugada(Jugada jugada)
    {
        this.jugada = jugada;
    }
    
    
    public void add()
    {
        Jugada obj;
        for(Sorteo s: jugadaSorteos)
        {
            obj = new Jugada(0, this.animal, s, null, null, this.monto);
            jugadas.add(obj);
        }
        this.animal = null;
        this.monto = BigDecimal.ZERO;
        
    }
    
    public void remove()
    {
       this.jugadas.remove(this.jugada);            
    }
    
    
}
