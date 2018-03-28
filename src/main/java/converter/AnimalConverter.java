package converter;

import dao.AnimalDAO;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.view.Location;
import model.Animal;
/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 */

@FacesConverter(forClass = Location.class, value = "animal")
public class AnimalConverter implements Converter {

    public static List<Animal> animales;

    public AnimalConverter() {
        AnimalDAO db = new AnimalDAO();
        animales = db.read("from Animal");
    }

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        Integer code =  Integer.parseInt(value);
        Animal obj = buscar(code);
        return obj;
        
    }
    
    @Override
     public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        if(o != null) {
            return String.valueOf(((Animal) o).getId());
        }
        else {
            return null;
        }
    }   
    
    public Animal buscar(int id)
    {
        for (Animal obj : animales)
        {
            if(obj.getId()==id)
            {
                return obj;
            }
        }
        return null;
    }

}
