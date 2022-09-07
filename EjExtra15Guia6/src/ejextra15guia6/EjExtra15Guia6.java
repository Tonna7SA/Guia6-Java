/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra15guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EjExtra15Guia6 {

    /**
     * @param args the command line arguments
     */
    /*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros para operar");
        System.out.println("Numero 1:");
        int numero1 = leer.nextInt();
        System.out.println("Numero 2;");
        int numero2 = leer.nextInt();
        System.out.println("");
        System.out.println("Menu de Operaciones");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Salir");
        System.out.println("Ingrese su eleccion:");
        int eleccion = leer.nextInt();

        switch (eleccion) {
            case 1:
                System.out.println(+numero1 + " + " + numero2 + " = " + suma(numero1, numero2));
                break;
            case 2:
                System.out.println(+numero1 + " - " + numero2 + " = " + resta(numero1, numero2));
                break;
            case 3:
                System.out.println(+numero1 + " * " + numero2 + " = " + multiplicacion(numero1, numero2));
                break;
            case 4:
                int aux;
                if (numero1 < numero2) {
                    aux = numero1;
                    numero1 = numero2;
                    numero2 = aux;
                }
                System.out.println(+numero1 + " / " + numero2 + " = " + division(numero1, numero2));
                break;
            case 5:
                System.out.println("Hasta Luego...");
                break;
            default:
                System.out.println("No tenemos operaciones para ese numero");
                System.out.println("Hasta Luego...");

        }

    }

    public static int suma(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        return resultado;
    }

    public static int resta(int numero1, int numero2) {
        int resultado = numero1 - numero2;
        return resultado;
    }

    public static int multiplicacion(int numero1, int numero2) {
        int resultado = numero1 * numero2;
        return resultado;
    }

    public static double division(int numero1, int numero2) {
        int aux;
        if (numero1 < numero2) {
            aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }
        double resultado = numero1 / numero2;
        return resultado;
    }
}
