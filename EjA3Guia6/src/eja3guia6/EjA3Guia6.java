/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eja3guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
public class EjA3Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        System.out.println("Su Frase en Mayusculas");
        System.out.println(frase.toUpperCase());
        System.out.println("Su Frase en Minisculas");
        System.out.println(frase.toLowerCase());
    }
    
}
