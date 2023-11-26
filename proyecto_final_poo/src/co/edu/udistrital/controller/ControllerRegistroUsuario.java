/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import co.edu.udistrital.model.Genero;
import co.edu.udistrital.model.Usuario;
import co.edu.udistrital.view.IniciarSesion;
import co.edu.udistrital.view.VentanaEmergente;
import co.edu.udistrital.view.VentanaRegistro;
import java.util.HashSet;

/**
 *
 * @author jhono
 */
public class ControllerRegistroUsuario {
    private VentanaRegistro v_registro;
    private IniciarSesion sesion;
    private VentanaEmergente ventanaEmergente = new VentanaEmergente();
    private Directorio dic = new Directorio();
    private HashSet<Usuario> directorio = dic.getDirectorio();
    private Usuario x; 
    EnviarCorreo enviarcorreo = new EnviarCorreo();

    public ControllerRegistroUsuario() {
        v_registro = new VentanaRegistro(this);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                v_registro.setVisible(false);
            }
        });
    }
    
    
    
    public void crearUsuario(){
        x = new Usuario(null, null, null, null);
        if(v_registro.getNombreUsuario().getText().equals("")||
           v_registro.getContraseña().getText().equals("")||
           v_registro.getCorreoElectronico().getText().equals("")){
            
       ventanaEmergente.mensaje("Coloque todos los datos para poder registrar al usuario");
        }else {
        String alias = v_registro.getNombreUsuario().getText();
        String contraseña = v_registro.getContraseña().getText();
        String aux = v_registro.getCorreoElectronico().getText();
        String correo = "";
        char aux2 = ' ';  
        for(int i = 0 ; i<aux.length(); i++){
            
            if(aux.charAt(i) == '@'){
                aux2 = '@'; 
            }
        }
       
        
        Genero genero = null;
        
        switch (String.valueOf(v_registro.getGenero().getSelectedItem())) {
            case "Masculino":
                genero=Genero.Masculino;
                break;
                
            case "Femenino":
                genero=Genero.Femenino;
                break;
            
            case "39 tipos de Gay":
                genero=Genero.TreintaYNueve_Tipos_de_Gay;
                break;
        }
        
        if (aux2 != '@'){
          ventanaEmergente.mensaje("Correo electrònico no es vàlido");
            
        } else {
            
                correo = aux;
           
                for(Usuario pers : directorio){
                    if(pers.getAlias().equals(alias)){
                   
                        ventanaEmergente.mensaje("El alias registrado ya existe");
                   
                    
                    }else {
                    
            x.setAlias(alias);
            x.setContraseña(contraseña);
            x.setCorreo(correo);
            x.setGenero(genero);
        v_registro.setVisible(false);
        ventanaEmergente.mensaje("El usuario fue registrado con èxito");
        v_registro.getNombreUsuario().setText("");
        v_registro.getContraseña().setText("");
        v_registro.getCorreoElectronico().setText("");
        
        
       
        
        x.calcularCupoTarjeta();
        directorio.add(x);
        
        enviarcorreo.setCorreoDestinatario(correo);
        enviarcorreo. setMensajeCorreo("Bienvenido al sistema HIDE&SEEK <br> <br>"
                + "Su nombre de usuario es: " + x.getAlias() + "<br>"
                + "Su contraseña es: " + x.getContraseña() + "<br>"
                + "Y su cupo de la tarjeta es: " + x.getCupo());
        enviarcorreo.crearCorreo();
        enviarcorreo.enviarCorreo();
         ventanaEmergente.mensaje("Se enviò un mensaje a su correo electrònico confirmando sus datos");
        
         for(Usuario user : directorio){
          
             
         }
                }
            }
        aux2=' ';   
        } 
                }
        }
    public void MostrarVentanaRegistro(){
        v_registro.setVisible(true);
    }
    public void OcultarVentanaRegistro(){
        v_registro.setVisible(false);
    }
}