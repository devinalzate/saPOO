/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import co.edu.udistrital.view.SesionPrincipal;

/**
 *Clase encargada de controlar la ventana de la pantalla principal de cada usuario
 * @author DEVIN ALZATE - SERGIO MENDIVELOS - JHON O'MEARA
 */
public class ControllerSesionPrincipal {
    SesionPrincipal v_ventanaSesionPrincipal=new SesionPrincipal();
    
    /**
     * Constructor que establece la visibilidad
     */
    public ControllerSesionPrincipal() {
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SesionPrincipal().setVisible(false);
            }
        });
    }
    public void MostrarSesionPrincipal(){
        v_ventanaSesionPrincipal.setVisible(true);
    }
    public void OcultarSesionPrincipal(){
        v_ventanaSesionPrincipal.setVisible(false);
    }
}
