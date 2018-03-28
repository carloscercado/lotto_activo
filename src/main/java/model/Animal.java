package model;
// Generated 27-mar-2018 18:42:42 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Animal generated by hbm2java
 */
public class Animal  implements java.io.Serializable {


     private int id;
     private String numero;
     private String nombre;
     private Set jugadas = new HashSet(0);

    public Animal() {
    }

	
    public Animal(int id, String numero, String nombre) {
        this.id = id;
        this.numero = numero;
        this.nombre = nombre;
    }
    public Animal(int id, String numero, String nombre, Set jugadas) {
       this.id = id;
       this.numero = numero;
       this.nombre = nombre;
       this.jugadas = jugadas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        hash = 23 * hash + this.id;
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
        final Animal other = (Animal) obj;
        if (this.id != other.id)
        {
            return false;
        }
        return true;
    }

    
    



}


