/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import java.util.ArrayList;

/**
 *
 * @author DEVIN ALZATE
 */
public class MMM {
    
    private int contadorManzanas = 5;
    private int precioManzana = 100;
    private int contadorFrijoles = 3;
    private int precioFrijoles = 600;
    private int contadorLeche = 2;
    private int precioLeche = 500;
    
    private ArrayList<Object>listaCompras = new ArrayList<>();
    
    public void mediana(){
        for (int i = 0 ; i < contadorManzanas ; i++){
        listaCompras.add("manzana");
        }   
        for (int i = 0 ; i < contadorFrijoles ; i++){
        listaCompras.add("frijoles");
        }
        for (int i = 0 ; i < contadorLeche ; i++){
        listaCompras.add("Leche");
        }
        
        int mediana = Math.round(listaCompras.size()/2);
        System.out.println(listaCompras);
        System.out.println(listaCompras.get(mediana));
    }
    
    public void media(){
        int mediaMan = precioManzana * contadorManzanas;
        int mediaFrij = precioManzana * contadorManzanas;
        int mediaLeche = precioLeche = contadorLeche;
        int media = (mediaMan + mediaFrij + mediaLeche)/3;
    }

}
