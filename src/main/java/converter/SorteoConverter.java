package converter;

import dao.SorteoDAO;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.view.Location;
import model.Sorteo;
/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 */

@FacesConverter(forClass = Location.class, value = "sorteo")
public class SorteoConverter implements Converter {

    public static List<Sorteo> sorteos;

    public SorteoConverter() {
        SorteoDAO db = new SorteoDAO();
        sorteos = db.read("from Sorteo");
    }

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        Integer code =  Integer.parseInt(value);
        Sorteo obj = buscar(code);
        return obj;
        
    }
    
    @Override
     public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        if(o != null) {
            return String.valueOf(((Sorteo) o).getId());
        }
        else {
            return null;
        }
    }   
    
    public Sorteo buscar(int id)
    {
        for (Sorteo obj : sorteos)
        {
            if(obj.getId()==id)
            {
                return obj;
            }
        }
        return null;
    }

}
