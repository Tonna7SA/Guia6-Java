/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eja19guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
*/
public class EjA19Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int matriz1[][] = new int[3][3];
        boolean respuesta = true;
        System.out.println("Ingrese los 9 numeros de la Matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz [" + (i + 1) + "][" + (j + 1) + "] = ");
                matriz[i][j] = leer.nextInt();
            }
        }
        System.out.println("");
        System.out.println("Matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz1[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz Traspuesta ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz1[i][j] + "]");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] + matriz1[i][j] != 0) {
                    respuesta = false;
                } 
                }
            }
        
        System.out.println("");
        if (respuesta == true) {
            System.out.println("La Matriz es Antisimetrica");
        } else {
            System.out.println("La Matriz no es Antisimetrica");
        }
        System.out.println("");
    }
}
