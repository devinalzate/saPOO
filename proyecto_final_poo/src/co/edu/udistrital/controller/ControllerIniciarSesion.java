/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import co.edu.udistrital.view.IniciarSesion;

/**
 *
 * @author jhono
 */
public class ControllerIniciarSesion {
       IniciarSesion v_iniciarSesion=new IniciarSesion();
    public ControllerIniciarSesion() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }
    public void MostrarIniciarSesion(){
        v_iniciarSesion.setVisible(true);
    }
    public void OcultarIniciarSesion(){
        v_iniciarSesion.setVisible(false);
    }
}
