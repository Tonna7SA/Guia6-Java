/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eja13guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
*/
public class EjA13Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el largo de los lados");
        int largo = leer.nextInt();
        for(int i=0; i<largo; i++){
            System.out.print(" * ");
        }
        System.out.println();
        for(int i=0; i<largo-2; i++){
            System.out.print(" * ");
            for(int j=0; j<largo-2; j++){
                System.out.print("   ");
            }
           System.out.println(" * ");
        }
        for(int i=0; i<largo; i++){
            System.out.print(" * ");
    }
    System.out.println();
}
}