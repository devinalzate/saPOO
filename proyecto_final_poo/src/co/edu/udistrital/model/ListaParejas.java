
package co.edu.udistrital.model;

import java.util.ArrayList;

/**
 *
 * @author DEVIN ALZATE
 */
public abstract class ListaParejas {
    
    protected ArrayList<Usuario> parejas = new ArrayList<Usuario>(); 

    public abstract void agregarPareja(Usuario pareja);
    
}
