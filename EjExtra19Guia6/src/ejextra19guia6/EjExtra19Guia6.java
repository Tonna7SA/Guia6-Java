/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra19guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EjExtra19Guia6 {

    /**
     * @param args the command line arguments
     */
    /*Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
    */
    public static void main(String[] args) {
        int vector[]={1,2,3,4,5};
        int vector1[] = new int [5];
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese los 5 numeros del vector a comparar:");
        for (int i = 0; i < 5; i++) {
            vector1[i]=leer.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if(vector[i] != vector1[i]){
                System.out.println("Uno de sus numeros no coincide");
                System.out.println("Los vectores no son iguales");
                break;
            }
            
        }
    }
    
}
