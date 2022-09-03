/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eja14guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
/*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/

public class EjA14Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Conversion: (D)Dolares, (Y)Yenes, (L)Libras;");
        String opcion = leer.nextLine();
        opcion = opcion.toUpperCase();
        System.out.println("Ingrese la cantidad de Euros a convertir:");
        double euros = leer.nextDouble();
        conversion(euros,opcion);
    }
    public static void conversion(double euros, String opcion){
        switch(opcion){
            case "D":
                System.out.println("Dolares = "+(euros*1.28611));
                break;
            case "Y":
                System.out.println("Yenes = "+(euros*129.852));
                break;
            case "L":
                System.out.println("Libras = "+(euros*0.86));
                break;
            default:
                System.out.println("Opcion Invalida");
        }
    }
}
