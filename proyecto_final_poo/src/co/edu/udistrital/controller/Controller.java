package co.edu.udistrital.controller;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author DEVIN ALZATE - SERGIO MENDIVELOS - JHON O'MEARA
 */
public class Controller {

    private static String correoBase = "nikomendi0728@gmail.com";
    private static String contraseñaBase = "cqlaaecmyncchjeh";
    private String correoDestinatario;
    private static String asuntoCorreo = "Registro exitoso";
    private static String mensajeCorreo = "PENDIENTE "; //OJOOOO PENDIENTE MENSAJE :)
 
    private Properties mProperties;
    private Session mSesion;
    private MimeMessage mCorreo;
    
    //Método constructor de Controller
    
    public Controller() {
        
    }
    
   //=========================================================================================================================================================================================
    
    // Este método se encarga de crear el correo a enviar.
    
    public void crearCorreo(){
        
   mProperties =  new Properties();

mProperties.put("mail.smtp.host", "smtp.gmail.com"); mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
mProperties.setProperty("mail.smtp.starttls.enable", "true"); mProperties.setProperty("mail.smtp.port", "587"); mProperties.setProperty("mail.smtp.user", correoBase);
mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
mProperties.setProperty("mail.smtp.auth", "true");


mSesion = Session.getDefaultInstance (mProperties);
   
          mCorreo = new MimeMessage(mSesion);
        try {
            mCorreo.setFrom(new InternetAddress(correoBase));
            mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(correoDestinatario));
            mCorreo.setSubject(asuntoCorreo);
            mCorreo.setText(mensajeCorreo, "ISO-8859-1", "html");
      

    }   catch (AddressException ex) {  
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
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
            
        } catch (MessagingException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } 

   
 }

    
}