/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eja20guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
*/
public class EjA20Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean a = true, b = true, c = true;
        int columna[] = new int[3];
        int fila[] = new int[3];
        int diagonal = 0, diagonal1 = 0, fil = 0, col = 0;
        int matriz[][] = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                columna[i] += matriz[i][j];
            }
        }
        col = columna[0];
        for (int i = 0; i < matriz.length; i++) {
            if (col != columna[i]) {
                a = false;
                break;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                fila[i] += matriz[j][i];
            }
        }
        fil = fila[0];
        for (int i = 0; i < matriz.length; i++) {
            if (fil != fila[i]) {
                b = false;
                break;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    diagonal += matriz[i][j];
                }
                if ((i + j) == 2) {
                    diagonal1 += matriz[i][j];
                }
            }
        }
        if (diagonal != diagonal1) {
            c = false;
        }
        if (a == true && b == true && c == true) {
            System.out.println("Matriz Cuadrada");
        } else {
            System.out.println("No es Matriz Cuadrada");
        }
    }
}            