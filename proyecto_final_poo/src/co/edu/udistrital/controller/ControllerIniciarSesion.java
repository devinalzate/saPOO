/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import co.edu.udistrital.model.Usuario;
import co.edu.udistrital.view.IniciarSesion;
import co.edu.udistrital.view.VentanaEmergente;

/**
 *  Clase encargada de controlar la ventana de inicio de sesion
 * @author DEVIN ALZATE - SERGIO MENDIVELOS - JHON O'MEARA
 */
public class ControllerIniciarSesion {
       private Controller control;
       private IniciarSesion v_iniciarSesion;
       private VentanaEmergente v_emergente;
       
    /**
     * Constructor que establece la visibilidad
     */
    public ControllerIniciarSesion(Controller control) {
        this.control = control;
        v_emergente = new VentanaEmergente();
        v_iniciarSesion = new IniciarSesion(control,this);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                v_iniciarSesion.setVisible(false);
            }
        });
    }
    
    public void iniciarSesion(){
        String aux = v_iniciarSesion.getTextAlias().getText();
        String aux1 = v_iniciarSesion.getTextContraseña().getText();
        
        for(Usuario usuarioARevision : control.getDir().getDirectorio()){
            if(usuarioARevision.getAlias().equals(aux)){
                if(usuarioARevision.getContraseña().equals(aux1)){
                    control.setUsuarioIniciado(usuarioARevision);
                    v_emergente.mensaje("Bienvenido " + usuarioARevision.getAlias());
                    break;
                }else {
                v_emergente.mensaje("La contraseña es incorrecta");
            }
            }else {
                v_emergente.mensaje("El alias registrado no existe");
            }
        }
    }
    
    public void MostrarIniciarSesion(){
        v_iniciarSesion.setVisible(true);
    }
    public void OcultarIniciarSesion(){
        v_iniciarSesion.setVisible(false);
    }
}
