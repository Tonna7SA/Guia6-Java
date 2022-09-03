/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */

/* EJERCICIO 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
*/

public class Ej12Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    int numero1, numero2;
    System.out.println("Ingrese 2 numeros:");
    numero1 = leer.nextInt();
    System.out.println("Ingrese el segundo numero:");
    numero2 = leer.nextInt();
    EsMultiplo(numero1,numero2);
    }
    
    public static void EsMultiplo (int numero1,int numero2){
        if (numero2/numero1==0){
            System.out.println("El primer numero es multiplo del segundo ingresado");
        }else{
            System.out.println("El primer numero no es multiplo del segundo ingresado");

        }
        
    }
}