/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eja21guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EjA21Guia6 {

    /**
     * @param args the command line arguments
     */
    /*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
    */
  
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matrizGrande = new int[10][10];
        int[][] matrizChica = new int[3][3];
        boolean a=false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizGrande[i][j] = (int) (Math.random() * 10);
            }
        }
        mostrarMatrizGrande(matrizGrande);
        System.out.println("Ingrese la matriz Reducida");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("[" + i + "," + j + "]");
                matrizChica[i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i<8&&j<8){
                if (matrizGrande[i][j] == matrizChica[0][0]){
                    if (matrizGrande[i + 1][j] == matrizChica[1][0] && matrizGrande[i + 1][j + 1] == matrizChica[1][1] && matrizGrande[i + 1][j + 2] == matrizChica[1][2]){
                        if (matrizGrande[i + 2][j] == matrizChica[2][0] && matrizGrande[i + 2][j + 1] == matrizChica[2][1] && matrizGrande[i + 2][j + 2] == matrizChica[2][2]){
                            System.out.println("Se encontro una simetria");
                            System.out.println("La matriz pequeña se encontró en las coordenadas: ");
                            a=true;
                            for (int k = i; k < i + 3; k++) {
                                for (int l = j; l < j + 3; l++) {
                                    System.out.print("[" + k + "," + l + "] ");
                                }
                                System.out.println("");
                            }
                            break;
                        }
                    }
                }
                
            }
            }
        }
        if(a==false){
            System.out.println("La matriz pequeña no se encontro dentro de la Matriz grande");
        }
    }

    public static void mostrarMatrizGrande(int[][] matrizGrande) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrizGrande[i][j] + " ");
            }
            System.out.println("");
        }
    }

}