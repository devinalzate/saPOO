/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import co.edu.udistrital.model.Genero;
import co.edu.udistrital.model.Usuario;
import java.util.HashSet;

/**
 *Clase encargada de controlar la ventana de la pantalla principal de cada usuario
 * @author DEVIN ALZATE - SERGIO MENDIVELOS - JHON O'MEARA
 */
public class Directorio {
    
    private HashSet<Usuario> directorio= new HashSet<Usuario>();

    public Directorio() {
        Usuario devinAdmin = new Usuario("Devin",18,"devin@gmail.com","SantaFeManda",Genero.TreintaYNueve_Tipos_de_Gay);
         directorio.add(devinAdmin);
    }

    
    
    public HashSet<Usuario> getDirectorio() {
        return directorio;
    }
    
    
    
    
    
}
