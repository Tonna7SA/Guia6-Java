/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra18guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EjExtra18Guia6 {

    /**
     * @param args the command line arguments
     */
    /*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
    */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       int suma=0;
       System.out.println("Ingrese los 5 numeros del vector");
       int vector [] = new int [5];
        for (int i = 0; i < 5; i++) {
            System.out.println("vector["+(i+1)+"]");
            vector[i]=leer.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            suma +=vector[i];
        }
        System.out.println("La suma de todos lo numeros del vector es: "+suma);
    }
    
}
