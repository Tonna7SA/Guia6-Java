/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eja16guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/
public class EjA16Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension del Vector:");
        int a = leer.nextInt();
        int vector [] = new int [a];
        for(int i=0 ; i<a ; i++){
            vector[i]= (int)(Math.random()* 10);
            System.out.print(+vector[i]+" ");
        }
        System.out.println("");
        System.out.println("Ingrese un numero a buscar del Vector");
        int b = leer.nextInt();
        for(int i=0 ; i<a ; i++){
            if(vector[i]==b){
                System.out.println("El numero buscado se encuentra en la posicion "+(i+1));
                continue;
            }
            if(i==a-1 && vector[i]!=b){
                System.out.println("El numero no esta dentro del Vector");
            }
        }
    }
    
}
