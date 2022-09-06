/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra3guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
*/
public class EjExtra3Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra:");
        String letra = leer.next();
        if(letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||
           letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")){
            System.out.println("Usted a ingresado una vocal...");
    }else System.out.println("Usted no a ingresado una vocal..");
    }
}
