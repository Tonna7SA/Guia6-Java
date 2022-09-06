/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra1guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
*/
public class EjExtra1Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos a convertir:");
        double minutos = leer.nextInt();
        convertir(minutos);
    }
    public static void convertir(double minutos){
        double horas = minutos/60;
        double dias = horas/24;
        int a = (int)(Math.floor(dias)); 
        int b = (int)(Math.round(Math.ceil(dias)));
        int c = (int)(minutos);
        System.out.println("Sus "+c+" minutos son: "+a+" dias y "+b+" horas.");
    }
}
