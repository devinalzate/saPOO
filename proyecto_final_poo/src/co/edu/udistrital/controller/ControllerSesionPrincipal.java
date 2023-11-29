/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import co.edu.udistrital.model.Usuario;
import co.edu.udistrital.view.SesionPrincipal;
import co.edu.udistrital.view.VentanaEmergente;

/**
 *Clase encargada de controlar la ventana de la pantalla principal de cada usuario
 * @author DEVIN ALZATE - SERGIO MENDIVELOS - JHON O'MEARA
 */
public class ControllerSesionPrincipal {
    SesionPrincipal v_ventanaSesionPrincipal;
    VentanaEmergente v_emergente;
    Controller control;
    
    /**
     * Constructor que establece la visibilidad
     */
    public ControllerSesionPrincipal(Controller control) {
        
        this.control = control;
        v_ventanaSesionPrincipal =new SesionPrincipal(control, this);
         v_emergente = new VentanaEmergente();
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                v_ventanaSesionPrincipal.setVisible(false);
            }
        });
    }
    
    public void agregarParejas(){
        
       String nombrePareja = v_emergente.escribirInput("Escriba el nombre del usuario al que quiere agregar a su lista de parejas.");
       String mensaje = null;
       for(Usuario usuarioARevision : control.getDir().getDirectorio()){
           
        if(usuarioARevision.getAlias().equals(nombrePareja)){

                    control.getUsuarioIniciado().agregarPareja(usuarioARevision);
                    usuarioARevision.agregarPareja(control.getUsuarioIniciado());
                   mensaje = "Su pareja ha sido agregada";
                    break;
            } else {
            
            mensaje = "El usuario no existe";
        }
        }
       v_emergente.mensaje(mensaje);
        
    }
    
    
    public void MostrarSesionPrincipal(){
        v_ventanaSesionPrincipal.setVisible(true);
    }
    public void OcultarSesionPrincipal(){
        v_ventanaSesionPrincipal.setVisible(false);
    }
}
