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
public class Ejercicio13conJOptionPane {
    
    public static void main(String[] args) {
        
        int numeroDeVentas = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de ventas a ingresar"));
        
        
        float totalDeVentas = 0;
                
        for (int i = 0; i < numeroDeVentas; i++) {
            
            totalDeVentas += Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto de la venta "+(i+1)+". Ejemplo: 15.75"));
        }
        
        JOptionPane.showMessageDialog(null, "El total de ventas es de: $"+ totalDeVentas);
    }
}
