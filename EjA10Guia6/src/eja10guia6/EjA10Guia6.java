/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eja10guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/
public class EjA10Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite positivo");
        int suma = 0;
        int numero = leer.nextInt();
        System.out.println("Ingrese numeros hasta que su suma supere el valor limite positivo");
        do{
            System.out.println("Ingrese numero");
            int valor = leer.nextInt();
            suma += valor;
        }while(suma<=numero);
    }
    
}
