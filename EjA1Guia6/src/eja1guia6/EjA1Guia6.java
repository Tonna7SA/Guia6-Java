/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eja1guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
/* Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma*/
public class EjA1Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Ingrese dos numeros enteros:");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
        int resultado = numero1+numero2;
        System.out.println("La suma de "+numero1+ " + "+numero2+" es = "+resultado);
        
    }
    
}
