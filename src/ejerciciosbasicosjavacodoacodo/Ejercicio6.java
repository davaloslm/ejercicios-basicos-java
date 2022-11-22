/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosbasicosjavacodoacodo;

import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Ingrese un número entero");
        int num = scanner.nextInt(); 
        
        if(num%2 == 0){
            System.out.println("El número ingresado es divisible por 2");
        
        }else{
            System.out.println("El número ingresado no es divisible por 2");
        }
        
        
    }
}
