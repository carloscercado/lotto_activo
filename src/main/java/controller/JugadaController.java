package controller;

import dao.AnimalDAO;
import dao.SorteoDAO;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;
import model.Animal;
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
    public JugadaController()
    {
    }

    public Animal getAnimal()
    {
        return animal;
    }

    public void setAnimal(Animal animal)
    {
        this.animal = animal;
    }

    
    public List<Animal> getAnimales()
    {
        AnimalDAO dao = new AnimalDAO();
        return dao.read("from Animal");
    }

    public void setAnimales(List<Animal> animales)
    {
        this.animales = animales;
    }

    public List<Sorteo> getSorteos()
    {
        SorteoDAO dao = (SorteoDAO) SorteoDAO.getInstance();
        return dao.read("from Sorteo");
    }

    public void setSorteos(List<Sorteo> sorteos)
    {
        this.sorteos = sorteos;
    }
}
