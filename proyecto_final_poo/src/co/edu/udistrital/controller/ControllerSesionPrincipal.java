/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import co.edu.udistrital.model.Usuario;
import co.edu.udistrital.view.SesionPrincipal;
import co.edu.udistrital.view.VentanaEmergente;
import java.util.ArrayList;

/**
 *Clase encargada de controlar la ventana de la pantalla principal de cada usuario
 * @author DEVIN ALZATE - SERGIO MENDIVELOS - JHON O'MEARA
 */
public class ControllerSesionPrincipal {
    SesionPrincipal v_ventanaSesionPrincipal;
    VentanaEmergente v_emergente;
    Controller control;
    ArrayList<String> horarios = new ArrayList<String>();
    
    /**
     * Constructor que establece la visibilidad
     */
    public ControllerSesionPrincipal(Controller control) {
        
        
        horarios.add("");
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
         
           
           if(nombrePareja.equals(control.getUsuarioIniciado().getAlias())){
               
               mensaje = "No puede agregarse a si mismo como pareja";
               
               break;
               
           }
               
               else if(usuarioARevision.getAlias().equals(nombrePareja)){
                   
                   if(control.getUsuarioIniciado().getListaParejas().getParejas().contains(usuarioARevision)){
               
               mensaje = "Esta pareja ya ha sido agregada anteriormente";
               
               break;
               
           } else {

                    control.getUsuarioIniciado().agregarPareja(usuarioARevision);
                    usuarioARevision.agregarPareja(control.getUsuarioIniciado());
                   mensaje = "Su pareja ha sido agregada";
                    break;
            
                }
                
            }
                else {
            
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
    
    public void asignarCupo(){
        
        if (control.getUsuarioIniciado().getListaParejas().getParejas().isEmpty()){
            v_emergente.mensaje("No tiene parejas registradas");
        } else {
        
        String parejaCupo = v_emergente.escribirInput("Esciba el nombre de la pareja a la que repartir el cupo");
        
        
        String mensaje = null;
        
        for(Usuario parejaARevision : control.getUsuarioIniciado().getListaParejas().getParejas()){
            
        if(parejaARevision.getAlias().equals(parejaCupo)){

            
           String valor = v_emergente.escribirInput("Usted tiene un cupo de " + control.getUsuarioIniciado().getCupo() + "Se le asignará a su pareja la cantidad que que registre a continuación: ");
           try{
           if(Integer.parseInt(valor)>control.getUsuarioIniciado().getCupo()){
               
               mensaje ="No tiene suficiente dinero para transferirle a su pareja";
               break;
           } else{
               
               control.getUsuarioIniciado().setCupo(control.getUsuarioIniciado().getCupo() - Integer.parseInt(valor));
               parejaARevision.setCupo( parejaARevision.getCupo() + Integer.parseInt(valor));        
               
               mensaje ="La transferencia fue exitosa";

                    break;
                    }
           }catch(Exception e){
               
               mensaje ="Error, ingrese un número entero";
break;  
           
         }
           }else{ 
            mensaje = "Ese usuario no se encuentra dentro de sus parejas";
        }
           
        }
           v_emergente.mensaje(mensaje);
        }
    }
    
    
    public void mostrarDatosUsuario(){
        
        
        
        v_emergente.mensaje( "Nombre: " + control.getUsuarioIniciado().getAlias() + "\n "
                + "Correo: "+ control.getUsuarioIniciado().getCorreo() + "\n "
                + "Edad:" + control.getUsuarioIniciado().getEdad() + "\n "
                + "Genero: " + control.getUsuarioIniciado().getGenero().toString() + "\n "
                + "Cupo disponible: " + control.getUsuarioIniciado().getCupo() + "\n "
                );
    }
    
    public void mostrarListaParejas(){
        
        if (control.getUsuarioIniciado().getListaParejas().getParejas().isEmpty()){
            
            v_emergente.mensaje("No hay parejas asignadas");
        } else {
        v_emergente.mensaje("Sus parejas son: ");
        for (Usuario pareja :control.getUsuarioIniciado().getListaParejas().getParejas()){
            
             v_emergente.mensaje(pareja.getAlias());
            }
        }
        
    }
    
    public void establecerHorarios(){
        
        
          if (control.getUsuarioIniciado().getListaParejas().getParejas().isEmpty()){
            v_emergente.mensaje("No tiene parejas registradas");
            
        } else {  
            
        String parejaHorario = v_emergente.escribirInput("Esciba el nombre de la pareja a la que quiere asignarle un horario");
        
        
        
         String nuevaFecha = v_emergente.escribirInput("Ingrese la fecha en formato DD/MM/AAAA");
        
        String[] partesDia = nuevaFecha.split("/");
                String dia = partesDia[0];
                String mes = partesDia[1];
                String año = partesDia[2];
                
          String nuevaHora = v_emergente.escribirInput("Ingresa la hora en formato HH:MM:SS");
               
                String[] partesHora = nuevaHora.split(":");
                int horas = Integer.parseInt(partesHora[0]);
                int minutos = Integer.parseInt(partesHora[1]);
                int segundos = Integer.parseInt(partesHora[2]); 
                
                 boolean conf = false;
                 
            

                if (horarios.contains(nuevaFecha + " - " + nuevaHora)){
                    
                    v_emergente.mensaje("El horario ya está ocupado");
                    
               }else {
                    
                    horarios.add(nuevaFecha + " - " + nuevaHora);
                    v_emergente.mensaje(nuevaFecha + " - " + nuevaHora + " Fue agregado al horario de " + parejaHorario);
                   }
                
                
                }
    }
    
    public void pedirSobrecupo(){
        
         if (control.getUsuarioIniciado().getListaParejas().getParejas().isEmpty()){
            v_emergente.mensaje("No tiene parejas registradas");
        } else {
        
        String parejaSobrecupo = v_emergente.escribirInput("Esciba el nombre de la pareja a la que pedirle el sobrecupo");
        
        for(Usuario parejaARevision : control.getUsuarioIniciado().getListaParejas().getParejas()){
            
        if(parejaARevision.getAlias().equals(parejaSobrecupo)){
        
            try{
            int sobrecupo = Integer.parseInt(v_emergente.escribirInput("Escriba el monto que desea solicitar"));
            
            control.getUsuarioIniciado().setCupo(control.getUsuarioIniciado().getCupo()+sobrecupo);
            parejaARevision.setCupo(parejaARevision.getCupo()- sobrecupo);
            
            v_emergente.mensaje("Su pareja ha aceptado su solicitud, ahora cuenta con un cupo extra de: " + sobrecupo);
            
            }catch (Exception e){
                
                v_emergente.mensaje("Error valor invalido");
            }
            
            
        } else {
            
            v_emergente.mensaje("Ese usuario no se encuentra dentro de sus parejas");
        }
        }
    }
}
    
    public void cerrarSesion(){
        
        v_emergente.mensaje(" ...Cerrando Sesión... ");
        control.setUsuarioIniciado(null);
        control.mostrarVentanaPrincipal();
        
        
    }
}
    
    
