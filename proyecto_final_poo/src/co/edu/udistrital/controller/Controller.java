package co.edu.udistrital.controller;

import co.edu.udistrital.model.Genero;
import co.edu.udistrital.model.Usuario;
import co.edu.udistrital.view.VentanaEmergente;
import co.edu.udistrital.view.VentanaRegistro;
import java.util.HashSet;



/**
 *
 * @author DEVIN ALZATE - SERGIO MENDIVELOS - JHON O'MEARA
 */
public class Controller {
    
    private VentanaRegistro v_registro;
    private VentanaEmergente ventanaEmergente = new VentanaEmergente();
    private HashSet<Usuario> directorio= new HashSet<Usuario>();
    private Usuario x; 

    public Controller() {
        
        v_registro = new VentanaRegistro(this);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                v_registro.setVisible(true);
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
        for(int i = 0 ; i<aux.length(); i++){
            
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
        
        x.setAlias(alias);
        x.setContraseña(contraseña);
        x.setCorreo(correo);
        x.setGenero(genero);
        
        directorio.add(x);
        for(Usuario user : directorio){
            
            ventanaEmergente.mensaje(user.getAlias());
            
            
        }
        v_registro.setVisible(false);
        ventanaEmergente.mensaje("El usuario fue registrado con èxito");
        
                
                
                }
        }
    }