package dao;

/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 */
public class DAO 
{
    private static Object instance = null;
    
    public static Object getInstance()
    {
        if (instance == null)
            instance = new Object();
        return instance;
    }

}
