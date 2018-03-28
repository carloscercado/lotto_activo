package model;
// Generated 27-mar-2018 18:42:42 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sorteo generated by hbm2java
 */
public class Sorteo  implements java.io.Serializable {


     private int id;
     private Date hora;
     private String loteria;
     private Set jugadas = new HashSet(0);

    public Sorteo() {
    }

	
    public Sorteo(int id, Date hora, String loteria) {
        this.id = id;
        this.hora = hora;
        this.loteria = loteria;
    }
    public Sorteo(int id, Date hora, String loteria, Set jugadas) {
       this.id = id;
       this.hora = hora;
       this.loteria = loteria;
       this.jugadas = jugadas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Date getHora() {
        return this.hora;
    }
    
    public void setHora(Date hora) {
        this.hora = hora;
    }
    public String getLoteria() {
        return this.loteria;
    }
    
    public void setLoteria(String loteria) {
        this.loteria = loteria;
    }
    public Set getJugadas() {
        return this.jugadas;
    }
    
    public void setJugadas(Set jugadas) {
        this.jugadas = jugadas;
    }

    @Override
    public int hashCode()
    {
        int hash = 5;
        hash = 97 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Sorteo other = (Sorteo) obj;
        if (this.id != other.id)
        {
            return false;
        }
        return true;
    }
    
    




}


