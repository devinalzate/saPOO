package co.edu.udistrital.controller;

import co.edu.udistrital.model.Genero;
import co.edu.udistrital.model.Usuario;
import co.edu.udistrital.view.IniciarSesion;
import co.edu.udistrital.view.VentanaEmergente;
import co.edu.udistrital.view.VentanaRegistro;
import java.util.HashSet;



/**
 *
 * @author DEVIN ALZATE - SERGIO MENDIVELOS - JHON O'MEARA
 */
public class Controller {
    
    
    private IniciarSesion sesion;
    private VentanaEmergente ventanaEmergente = new VentanaEmergente();
    private Directorio dic = new Directorio();
    private HashSet<Usuario> directorio = dic.getDirectorio();
    private Usuario x; 
    EnviarCorreo enviarcorreo = new EnviarCorreo();
    ControllerRegistroUsuario registro;

    public Controller() {
        
 
        registro=new ControllerRegistroUsuario();
        
        
        sesion = new IniciarSesion(this);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sesion.setVisible(false);
            }
        });
    }
    public void MostrarVentanaPrincipal(){
       
       
    }


//=========================================================================================================================================================================================
    
    // Mètodo encargado de las validaciones necesarias para registrar un usuario.  
    
    
    
    //=========================================================================================================================================================================================
    
    // Este método se encarga de iniciar sesiòn
    
    public void iniciarSesion(){
        
    }
    
    }