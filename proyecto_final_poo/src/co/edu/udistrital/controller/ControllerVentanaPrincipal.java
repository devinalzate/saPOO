/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import co.edu.udistrital.view.VentanaPrincipal;

/**
 *Clase encargada de controlar la ventana de la pantalla principal de cada usuario
 * @author DEVIN ALZATE - SERGIO MENDIVELOS - JHON O'MEARA
 */
public class ControllerVentanaPrincipal {
    
    private Controller control;
    private VentanaPrincipal v_ventanaPrincipal;
    
    /**
     * Constructor que establece la visibilidad
     */
    public ControllerVentanaPrincipal(Controller control) {
        this.control = control;
        v_ventanaPrincipal=new VentanaPrincipal(control);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 v_ventanaPrincipal.setVisible(true);
            }
        });
    }
    public void MostrarVentanaPrincipal(){
        v_ventanaPrincipal.setVisible(true);
    }
    public void OcultarVentanaPrincipal(){
        v_ventanaPrincipal.setVisible(false);
    }
}
