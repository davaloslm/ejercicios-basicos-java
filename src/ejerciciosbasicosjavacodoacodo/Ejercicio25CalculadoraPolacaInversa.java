/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosbasicosjavacodoacodo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Leo
 */
public class Ejercicio25CalculadoraPolacaInversa {
    
    public static void main(String[] args) {
        
        double operando1;
        double operando2;
        double resultado=0;
        String signo;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe el número 1");
        operando1 = sc.nextDouble();
        
        System.out.println("Escribe el número 2");
        operando2 = sc.nextDouble();
        
        System.out.println("Introduzca el signo. Ej.: +,-,*,/,^,%");
        signo= sc.next();
        
        switch(signo){
            case "+":
                resultado = operando1 + operando2;
                
                break;
             case "-":
                resultado = operando1 - operando2;
                
                break;
             case "*":
                resultado = operando1 * operando2;
                
                break;
            case "/":
                resultado = operando1 / operando2;
                
                break;
             case "^":
                resultado = Math.pow(operando1, operando2);
                
                break;
            case "%":
                resultado = operando1 % operando2;

        }
        
        JOptionPane.showMessageDialog(null, operando1+" "+signo+" "+operando2+" = "+resultado);
    }
}
