/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosbasicosjavacodoacodo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author Leo
 */
public class Ejercicio18 {
    
    public static void main(String[] args) {
        
        Integer  numeros[] = new Integer[10];
        
        numeros[0] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número. 1/10"));
        numeros[1] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número. 2/10"));
        numeros[2] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número. 3/10"));
        numeros[3] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número. 4/10"));
        numeros[4] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número. 5/10"));
        numeros[5] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número. 6/10"));
        numeros[6] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número. 7/10"));
        numeros[7] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número. 8/10"));
        numeros[8] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número. 9/10"));
        numeros[9] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número. 10/10"));
        
        int min = Collections.min(Arrays.asList(numeros));
        int max = Collections.max(Arrays.asList(numeros));
        
//        System.out.println(Arrays.toString(numeros));
//        System.out.println(Collections.min(Arrays.asList(numeros)));
//        System.out.println(Collections.max(Arrays.asList(numeros)));
        
        Random random = new Random();
        int numeroRandom = random.nextInt(max + 1 - min) + min;

        JOptionPane.showMessageDialog(null, "Número aleatorio entre "+min+" y "+max+": "+numeroRandom);
        
    }
    
}
