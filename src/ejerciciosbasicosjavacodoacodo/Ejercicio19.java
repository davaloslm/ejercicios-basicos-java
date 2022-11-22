/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosbasicosjavacodoacodo;

import javax.swing.JOptionPane;

/**
 *
 * @author Leo
 */
public class Ejercicio19 {
    
    public static void main(String[] args) {
        
        int numeroIngresado;
        
        do {            
            numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero positivo. (Hasta 10 dígitos)"));
        } while (numeroIngresado <=0);
        
        
        if (Integer.toString(numeroIngresado).length() == 1) {
            JOptionPane.showMessageDialog(null, "El número ingresado tiene 1 dígito.");

        }else{
            JOptionPane.showMessageDialog(null, "El número ingresado tiene "+Integer.toString(numeroIngresado).length()+" dígitos.");

        }
        
    }
    
}
