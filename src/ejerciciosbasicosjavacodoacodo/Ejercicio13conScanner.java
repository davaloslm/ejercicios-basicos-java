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
public class Ejercicio13conScanner {
    
    public static void main(String[] args) {
        
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidad de ventas a ingresar");
        
        int numeroDeVentas = sc1.nextInt();
        
        float totalDeVentas = 0;
        
        
        for (int i = 0; i < numeroDeVentas; i++) {
            System.out.println("Ingrese el monto de la venta "+(i+1));
            
            totalDeVentas += sc1.nextFloat();
        }
        
        System.out.println("El total de ventas es de: $"+totalDeVentas);
        
        
    }
}
