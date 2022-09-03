/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eja5guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/
public class EjA5Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        int numero = leer.nextInt();
        System.out.println("El doble de "+numero+ " es: "+numero*2);
        System.out.println("El triple de " +numero+ " es: "+numero*3);
        System.out.println("La raiz cuadrada de "+numero+ " es: "+Math.sqrt(numero));
     }
    
}
