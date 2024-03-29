
package co.edu.udistrital.model;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author DEVIN ALZATE - SERGIO MENDIVELSO - JHON O'MEARA
 * Clase creadora de los objetos tipo usuario
 */
public class Usuario implements CupoTarjeta { 

    private ListaParejas listaParejas;
    private ArrayList<Usuario> parejas; 
    private String alias;
    private int edad;
    private String contraseña;
    private String correo;
    private Genero genero;
    private int cupo;
    private Random rnd = new Random();
    
    /**
     * Metodo constructor del objeto usuario
     * 
     * @param alias: Nombre con el que se identificara el usuario (unico)
     * @param contraseña: Contraseña de ingreso para cada usuario
     * @param correo: Correo de registro de cada usuario 
     * @param genero: Genero del usuario
     */
    
    
    public Usuario(String alias,int edad, String correo, String contraseña, Genero genero) {
        this.alias = alias;
        this.contraseña = contraseña;
        this.correo = correo;
        this.genero = genero;
        this.edad= edad;
        listaParejas = new ListaParejas();
        parejas = listaParejas.getParejas();
    }

    //Get
    public String getAlias() {
        return alias;
    }

    //Set
    public void setAlias(String alias) {
        this.alias = alias;
    }

    //Get
    public String getContraseña() {
        return contraseña;
    }

    //Set
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    //Get
    public String getCorreo() {
        return correo;
    }

    //Set
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //Get
    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
    
    
    //Método encargado de agregar parejas al listado protegido de parejas.

    /*
     * @param pareja: Pareja que se va a agregar a la lista de parejas del usuario.
    */
    
    public void agregarPareja(Usuario pareja) {

    parejas.add(pareja);
        
    }

    //Método encargado de asignar un valor aleatorio entre 1000000 y 50000000 a la tarjeta del usuario al iniciar su registro en la plataforma.
    
    @Override
    public void calcularCupoTarjeta() {

    this.cupo = rnd.nextInt(1000000, 5000000);
    
    }

    public ListaParejas getListaParejas() {
        return listaParejas;
    }
    
    
}
