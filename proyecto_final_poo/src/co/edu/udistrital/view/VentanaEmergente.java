/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.view;

import javax.swing.JOptionPane;

/**
 *
 * @author jhono
 */
public class VentanaEmergente {
    public void mensaje(String a){
        JOptionPane.showMessageDialog(null, a);
    }
    
    public String escribirInput(String a){
        
        String b = JOptionPane.showInputDialog(a);
        return b;  
    }
}
