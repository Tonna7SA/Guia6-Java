/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */

/* EJERCICIO 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break. */

public class Ej9Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int numero;
        int suma = 0;
        int contador = 0;
        do{
            System.out.println("Ingrese un numero: ");
            numero = leer.nextInt();
            if (numero>0){
            suma=suma+numero;
            }
            contador++;
            if (numero==0){
                System.out.println("Se capturo el numero cero");
                break;
            }
            if (contador==20){
                System.out.println("Ya a ingresado 20 numeros");
                break;
            }
        }while (numero != 0);
        System.out.println("La suma total de los numeros ingresados es: " + suma);
    }
}


