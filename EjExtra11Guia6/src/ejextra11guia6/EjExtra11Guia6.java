/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra11guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EjExtra11Guia6 {

    /**
     * @param args the command line arguments
     */
    /*Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
    */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para contar sus digitos");
        int numero = leer.nextInt();
        int numero1=numero;
        int aux=0, contador=0;
        do{
            aux=numero/10;
            numero=aux;
            contador++;
            
        }while(numero>0);
        System.out.println("La cantidad de digitos del numero "+numero1+" es "+contador);
    }
       
}
