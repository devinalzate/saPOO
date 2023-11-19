
package co.edu.udistrital.model;

import java.util.Random;

/**
 *
 * @author DEVIN ALZATE - SERGIO MENDIVELSO - JHON O'MEARA
 * Clase destinada a administrar la tarjeta
 */
public class CupoTarjeta {
    
    private int valor;
    private Random rnd = new Random();

    /**
     * Metodo constrtuctor del cupo que tendra la tarjeta
     */
    public CupoTarjeta() {
        this.valor = rnd.nextInt(1000000, 5000000);
    }

    //Get
    public int getValor() {
        return valor;
    }

    //Set
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    
    
}
