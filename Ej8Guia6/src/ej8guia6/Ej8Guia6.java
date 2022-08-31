/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */

/* 
EJERCICIO 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta. */

public class Ej8Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
   System.out.println("Ingrese una nota para validar: ");
   int nota = leer.nextInt();
   while (nota<0||nota>10){
   System.out.println("Ingrese otra nota: ");
   nota = leer.nextInt();
   }
   
    }
    
}
