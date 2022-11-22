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
public class Ejercicio15 {
    
    public static void main(String[] args) {
        
        float num1;
        
        do{
            num1 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca un número mayor o igual a 0"));
        }while(num1 <=0);
                
    }
}
