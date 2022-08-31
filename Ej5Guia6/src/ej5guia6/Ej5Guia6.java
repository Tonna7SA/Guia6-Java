/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
/* EJERCICIO 5
Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
Scanner. */

public class Ej5Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese un numero decimal: ");
        double decimal = leer.nextDouble();
       System.out.println("Ingrese un caracter: ");
         char letra = leer.next().charAt(0);
       System.out.println("Ingrese una condicion: ");
       boolean bandera = leer.nextBoolean();
       System.out.println(decimal);
       System.out.println(letra);
       System.out.println(bandera);
        
        
    }
    
}
