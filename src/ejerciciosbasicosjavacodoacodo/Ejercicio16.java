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
public class Ejercicio16 {
    
    public static void main(String[] args) {
        
        String contraseña = "pass123";
        
        int intentos = 3;
        
        boolean acierto = false;
        
        String contraseñaIngresada;
        
        for (int i = 0; i < intentos && !acierto; i++) {
            contraseñaIngresada = JOptionPane.showInputDialog("Ingrese su contraseña. Tiene tres intentos.");
            
            if(contraseñaIngresada.equals(contraseña)){
                acierto = true;
                JOptionPane.showMessageDialog(null, "Enhorabuena");
            }
        }
    }
}
