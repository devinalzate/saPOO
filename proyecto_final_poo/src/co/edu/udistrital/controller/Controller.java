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
    private ControllerIniciarSesion controllerIniciarSesion;
    private ControllerRegistroUsuario controllerVentanaRegistro;
    private ControllerSesionPrincipal controllerVentanaSesionPrincipal;
    private ControllerVentanaPrincipal controllerVentanaPrincipal;
    
    private IniciarSesion sesion;
    private VentanaEmergente ventanaEmergente = new VentanaEmergente();
    private Directorio dic = new Directorio();
    private HashSet<Usuario> directorio = dic.getDirectorio();
    private Usuario x; 
    EnviarCorreo enviarcorreo = new EnviarCorreo();
    ;

    public Controller() {
        controllerIniciarSesion = new ControllerIniciarSesion();
        controllerVentanaRegistro = new ControllerRegistroUsuario();
        controllerVentanaSesionPrincipal = new ControllerSesionPrincipal();
        controllerVentanaPrincipal = new ControllerVentanaPrincipal();
    }
    public void mostrarVentanaPrincipal(){
        controllerIniciarSesion.OcultarIniciarSesion();
        controllerVentanaRegistro.OcultarVentanaRegistro();
        controllerVentanaSesionPrincipal.OcultarSesionPrincipal();
        controllerVentanaPrincipal.MostrarVentanaPrincipal();
    }
    public void mostrarVentanaRegistro() {
        controllerIniciarSesion.OcultarIniciarSesion();
        controllerVentanaRegistro.MostrarVentanaRegistro();
        controllerVentanaSesionPrincipal.OcultarSesionPrincipal();
        controllerVentanaPrincipal.OcultarVentanaPrincipal();
    }
    public void mostrarVentanaIniciarSesion() {
        controllerIniciarSesion.MostrarIniciarSesion();
        controllerVentanaRegistro.OcultarVentanaRegistro();
        controllerVentanaSesionPrincipal.OcultarSesionPrincipal();
        controllerVentanaPrincipal.OcultarVentanaPrincipal();
    }
    public void mostrarVentanaSesionPrincipal() {
        controllerIniciarSesion.OcultarIniciarSesion();
        controllerVentanaRegistro.OcultarVentanaRegistro();
        controllerVentanaSesionPrincipal.MostrarSesionPrincipal();
        controllerVentanaPrincipal.OcultarVentanaPrincipal();
    }
//=========================================================================================================================================================================================
    
    // Mètodo encargado de las validaciones necesarias para registrar un usuario.  
    
    
    
    //=========================================================================================================================================================================================
    
    // Este método se encarga de iniciar sesiòn
    
    public void iniciarSesion(){
        
    }
    
    }