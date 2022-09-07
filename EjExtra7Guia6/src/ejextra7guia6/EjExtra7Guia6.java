/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra7guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
/*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
public class EjExtra7Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantidad = 0;
        version1(cantidad, leer);

    }

    public static void version1(int cantidad, Scanner leer) {
        System.out.println("Ingrese la cantidad de numeros a comparar:");
        cantidad = leer.nextInt();

        while (cantidad < 1 || cantidad > 10) {
            System.out.println("Ingrese una cantidad valida");
            cantidad = leer.nextInt();
        }

        int vector[] = new int[cantidad];
        int i = 0, max = 0, min = 0;
        System.out.println("Ingrese los " + cantidad + " numeros:");

        do {
            vector[i] = leer.nextInt();
            i++;

        } while (i != cantidad);
        min = vector[0];
        max = vector[0];

        for (int j = 0; j < cantidad; j++) {
            if (vector[j] > max) {
                max = vector[j];
            }
            if (vector[j] < min) {
                min = vector[j];
            }
        }
        System.out.println("El minimo ingresado es: " + min);
        System.out.println("El maximo ingresado es: " + max);

    }

}
