/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra12guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EjExtra12Guia6 {

    /**
     * @param args the command line arguments
     */
    /*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String newvector[] = new String[10];
        int vector4[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < vector4.length; i++) {
            newvector[i] = String.valueOf((int) vector4[i]);
            if (newvector[i].equals("3")) {
                newvector[i] = "E";
            }
            System.out.print(newvector[i] + " ");
        }
        System.out.println("");
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                for (int l = 0; l < 10; l++) {
                    System.out.print(newvector[j] + "-" + newvector[k] + "-" + newvector[l]);
                    System.out.println("");
                }
            }
        }
    }
}

/* String vector1[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String vector2[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String vector3[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (vector3[k].equals("3")) {
                        vector3[k] = "E";
                    }
                    if (vector2[j].equals("3")) {
                        vector2[j] = "E";
                    }
                    if (vector1[i].equals("3")) {
                        vector1[i] = "E";
                    }
                    System.out.print(vector1[i] + "-" + vector2[j] + "-" + vector3[k]);
                    System.out.println(" ");
                }

            }//String numCadena = String.valueOf(numEntero);
        }*/
