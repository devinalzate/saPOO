/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import co.edu.udistrital.view.VentanaPrincipal;

/**
 *
 * @author jhono
 */
public class ControllerVentanaPrincipal {
    VentanaPrincipal v_ventanaPrincipal=new VentanaPrincipal();
    public ControllerVentanaPrincipal() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
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
