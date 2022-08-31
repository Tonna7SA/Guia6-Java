/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
/* EJERCICIO 6
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25. */

public class Ej6Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese un numero entero: ");
    int numero1 = leer.nextInt();
    System.out.println("Ingrese otro numero entero: ");
    int numero2 = leer.nextInt();
    if (numero1>25) {
        if (numero2>25){
            System.out.println("Los numeros "+numero1+" y "+numero2+" son mayores a 25");
        }else
            System.out.println("El numero "+numero1+" es mayor a 25, pero "+numero2+" no es mayor a 25");
        
        }else if (numero1<25 && numero2<25){
        System.out.println("Los numeros "+numero1+" y "+numero2+" no son mayores a 25");
        }
        if (numero1<25 && numero2>25){
        System.out.println("El numero "+numero1+" no es mayor a 25, pero "+numero2+" si es mayor a 25");
    }
    
        


            
    }
    
}
