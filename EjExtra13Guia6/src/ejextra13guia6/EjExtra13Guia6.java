/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra13guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EjExtra13Guia6 {

    /**
     * @param args the command line arguments
     */
    /*Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera de numeros");
        int numero = leer.nextInt();
        System.out.println("");
        System.out.println("Escalera de Numeros");
        System.out.println("");
        for (int i = 0; i<numero; i++) {
            for (int j = 0; j<=i; j++) {
                System.out.print(j+1);
            }
            System.out.println("");
        }
    }
    
}
