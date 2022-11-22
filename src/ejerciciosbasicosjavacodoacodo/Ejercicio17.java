/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosbasicosjavacodoacodo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Leo
 */
public class Ejercicio17 {
    
    public static void main(String[] args) {
        
                
        String dia = JOptionPane.showInputDialog("Ingrese un día de la semana").toLowerCase();

        
            switch (dia) {
            case "sábado":
            case "domingo":
                
                JOptionPane.showMessageDialog(null, "El día "+dia+" no es un día laboral.");
                
                break;
            case "lunes":
            case "martes":
            case "miércoles":
            case "jueves":
            case "viernes":
                
                JOptionPane.showMessageDialog(null, "El día "+dia+" es un día laboral.");
                
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ingrese un día válido.");

                
            }
        
            
        
        
    }

}
