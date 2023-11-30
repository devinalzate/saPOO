package co.edu.udistrital.controller;

import co.edu.udistrital.model.Usuario;



/**
 * Ejecutar y darle un manejo a los datos manipulados en el programa
 * @author DEVIN ALZATE - SERGIO MENDIVELOS - JHON O'MEARA
 */
public class Controller {
    private ControllerIniciarSesion controllerIniciarSesion;
    private ControllerRegistroUsuario controllerVentanaRegistro;
    private ControllerSesionPrincipal controllerVentanaSesionPrincipal;
    private ControllerVentanaPrincipal controllerVentanaPrincipal;
    private Directorio dir;
    private Usuario usuarioIniciado=null;
    private Usuario nuevaPareja = null;
    private MMM mmm = new MMM();
    ;
    /**
     * Inicializa los controladores de cada una de las ventanas.
     */
    public Controller() {
        mmm.mediana();
        mmm.media();
        dir = new Directorio();
        controllerIniciarSesion = new ControllerIniciarSesion(this);
        controllerVentanaRegistro = new ControllerRegistroUsuario(this);
        controllerVentanaSesionPrincipal = new ControllerSesionPrincipal(this);
        controllerVentanaPrincipal = new ControllerVentanaPrincipal(this);
    }
// ==============================================================================================
    
    /**
     * Metodo que asigna que ventanas se ocultan y muestran.
     */
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

    public Directorio getDir() {
        return dir;
    }

    public void setDir(Directorio dir) {
        this.dir = dir;
    }

    public Usuario getUsuarioIniciado() {
        return usuarioIniciado;
    }

    public void setUsuarioIniciado(Usuario usuarioIniciado) {
        this.usuarioIniciado = usuarioIniciado;
    }

    public Usuario getNuevaPareja() {
        return nuevaPareja;
    }

    public void setNuevaPareja(Usuario nuevaPareja) {
        this.nuevaPareja = nuevaPareja;
    }
    
    
    
    
    
}
  