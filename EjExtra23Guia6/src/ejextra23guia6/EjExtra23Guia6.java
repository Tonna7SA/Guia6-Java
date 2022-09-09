/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra23guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
/*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
public class EjExtra23Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String matrizsopa[][] = new String[20][20];
        String matrizpalabra[][] = new String[5][5];
        int aleatorio[] = {6, 10, 15, 2, 18};
        int contador = 0;
        int i = 0;
        System.out.println("Ingrese 5 palabras para la Sopa de Letras");
        do {
            System.out.println("Palabra N° " + (contador + 1));
            String palabra = leer.nextLine();
            palabra = palabra.toUpperCase();
            if (palabra.length() < 3 || palabra.length() > 5) {
                System.out.println("la palabra a ingresar debe tener de 3 a 5 caracteres, por favor...");
                System.out.println("Intente de nuevo:");
                palabra = leer.next();
                palabra = palabra.toUpperCase();
            }
            for (int j = 0; j < matrizpalabra[0].length; j++) {
                if (j <= palabra.length() - 1) {
                    matrizpalabra[i][j] = palabra.substring(j, j + 1);
                } else {
                    matrizpalabra[i][j] = String.valueOf((int) (Math.random() * 10));
                }
            }
            i++;
            contador++;
        } while (contador < 5);
        System.out.println("");
        for (int k = 0; k < matrizpalabra.length; k++) {
            for (int l = 0; l < matrizpalabra[0].length;l++) {
                matrizsopa[aleatorio[k]][l] = matrizpalabra[k][l];
            }
        }
        System.out.println("----S O P A---D E---L E T R A S----");
        System.out.println(" ");
        for (int j=0; j<matrizsopa.length;j++){
            for (int z = 0; z < matrizsopa[0].length;z++) {
                if (matrizsopa[j][z] == null) {
                    matrizsopa[j][z] = String.valueOf((int) (Math.random() * 10));
                }
                System.out.print("[" + matrizsopa[j][z] + "] ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
