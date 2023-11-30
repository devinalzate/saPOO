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
    private int contadorArroz = 5;
    private int precioArroz= 500;
    private int contadorCondones = 10;
    private int precioCondones = 1000;
    
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
        for (int i = 0 ; i < contadorArroz ; i++){
        listaCompras.add("arroz");
        }
        for (int i = 0 ; i < contadorCondones ; i++){
        listaCompras.add("condones");
        }
        
        int mediana = Math.round(listaCompras.size()/2);
        System.out.println(listaCompras);
        System.out.println(listaCompras.get(mediana));
    }
    
    public void media(){
        int mediaMan = precioManzana * contadorManzanas;
        int mediaFrij = precioManzana * contadorManzanas;
        int mediaLeche = precioLeche * contadorLeche;
        int mediaArroz = precioArroz * contadorArroz;
        int mediaCondoes = precioCondones * contadorCondones;
        int media = (mediaMan + mediaFrij + mediaLeche + mediaArroz + mediaCondoes)/5;
        System.out.println("La media es: " + media);
    }

}
