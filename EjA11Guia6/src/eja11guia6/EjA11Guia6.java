/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eja11guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.*/
public class EjA11Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero para operar");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero para operar");
        int numero2 = leer.nextInt();
        int opcion;
        String letra;
        boolean resp = false;
        System.out.println("");
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija su opcion: ");
            opcion = leer.nextInt();
            if (opcion == 5) {
                System.out.println("");
                System.out.print("Esta seguro de Salir (S/N)");
                letra = leer.next();
                if (letra.equalsIgnoreCase("S")) {
                    System.out.println("");
                    System.out.println("Hasta Luego...");
                    System.out.println("");
                    resp = true;
                 }else System.out.println("");
            }
            switch (opcion){
                case 1:
                    System.out.println("");
                    System.out.println("Suma " + numero1 + "+" + numero2 + "=" + (numero1 + numero2));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Resta " + numero1 + "-" + numero2 + "=" + (numero1 - numero2));
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Multiplicacion " + numero1 + "*" + numero2 + "=" + (numero1 * numero2));
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Division " + numero1 + "/" + numero2 + "=" + (numero1 / numero2));
                    System.out.println("");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("");
                    System.out.println("Por favor ingrese una opcion valida!!!");
                    System.out.println("");
            }
        } while (!resp);
    }
}
