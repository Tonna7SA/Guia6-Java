/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eja6guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
/*Crear un programa que dado un numero determine si es par o impar.*/
public class EjA6Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero = leer.nextInt();
        if(numero%2==0){
            System.out.println("El numero ingresado es par");
        }else{System.out.println("El numero ingresado no es par");
        }
        
    }
    
}
