/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eja17guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
*/
public class EjA17Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, contador5 = 0;
        System.out.println("Ingrese la dimension del Vector");
        int a = leer.nextInt();
        int vector[] = new int[a];
        System.out.println("Ingrese los " + a + " numeros para el Vector");
        for (int i = 0; i < a; i++) {
            vector[i] = leer.nextInt();
        }
        System.out.println("");
        for (int i = 0; i < a; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        for (int i = 0; i < a; i++) {
            String b = String.valueOf(vector[i]);
            int c = b.length();
            if (c == 1) {
                contador1++;
            }
            if (c == 2) {
                contador2++;
            }
            if (c == 3) {
                contador3++;
            }
            if (c == 4) {
                contador4++;
            }
            if (c == 5) {
                contador5++;
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Numeros con 1 Digitos:" + contador1 + "");
        System.out.println("Numeros con 2 Digitos:" + contador2 + "");
        System.out.println("Numeros con 3 Digitos:" + contador3 + "");
        System.out.println("Numeros con 4 Digitos:" + contador4 + "");
        System.out.println("Numeros con 5 Digitos:" + contador5 + "");
        System.out.println("");
    }
}