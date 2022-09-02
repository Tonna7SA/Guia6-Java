/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10guia6;

import java.util.Scanner;
/**
 *
 * @author User
 */

/* EJERCICIO 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/

public class Ej10Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese 4 numeros entre (1 y 20)");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        int numero3 = leer.nextInt();
        int numero4 = leer.nextInt();
        
        
        
        System.out.println("");
        System.out.print(numero1+" ");
        for (int i=0;i<numero1;i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(numero2+" ");
        for (int i=0;i<numero2;i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(numero3+" ");
        for (int i=0;i<numero3;i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(numero4+" ");
        for (int i=0;i<numero4;i++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
