/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import java.util.Properties;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * Clase dedicada a manejar la logica para enviar los correos
 * @author Devin Alzate - Sergio Mendivelso - Jhon Omeara
 */
public class EnviarCorreo {
    
    private static String correoBase = "nikomendi0728@gmail.com";
    private static String contraseñaBase = "fsbekyxptbokydym";
    private String correoDestinatario;
    private static String asuntoCorreo = "Registro exitoso";
    private String mensajeCorreo; 
 
    private Properties mProperties;
    private Session mSesion;
    private MimeMessage mCorreo;
    
    public void crearCorreo(){
        
        try {
            mProperties =  new Properties();
            
            mProperties.put("mail.smtp.host", "smtp.gmail.com"); mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
            mProperties.setProperty("mail.smtp.starttls.enable", "true"); mProperties.setProperty("mail.smtp.port", "587"); mProperties.setProperty("mail.smtp.user", correoBase);
            mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
            mProperties.setProperty("mail.smtp.auth", "true");
            
            
            mSesion = Session.getDefaultInstance (mProperties);
            
            mCorreo = new MimeMessage(mSesion);
            
            mCorreo.setFrom(new InternetAddress(correoBase));
            mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(correoDestinatario));
            mCorreo.setSubject(asuntoCorreo);
            mCorreo.setText(mensajeCorreo, "ISO-8859-1", "html");
        } catch (AddressException ex) {
            Logger.getLogger(EnviarCorreo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(EnviarCorreo.class.getName()).log(Level.SEVERE, null, ex);
        }
      

  
}
    //=========================================================================================================================================================================================
    
    // Este método se encarga de enviar el correo creado con anterioridad.
      public void enviarCorreo(){
        Transport mTransport;
        try {
            
            
            
            
            mTransport = mSesion.getTransport("smtp");
            mTransport.connect(correoBase, contraseñaBase);
            mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
            mTransport.close();
        } catch (NoSuchProviderException ex) {
            Logger.getLogger(EnviarCorreo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(EnviarCorreo.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        

   
 }

      //=========================================================================================================================================================================================
    
    // Get
    public String getCorreoDestinatario() {
        return correoDestinatario;
    }

    // Set
    public void setCorreoDestinatario(String correoDestinatario) {
        this.correoDestinatario = correoDestinatario;
    }

    public String getMensajeCorreo() {
        return mensajeCorreo;
    }

    public void setMensajeCorreo(String mensajeCorreo) {
        this.mensajeCorreo = mensajeCorreo;
    }
    
    
      
      
}
