/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ej11Guia6 {

    /**
     * @param args the command line arguments
     */
    
    /* EJERCICIO 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % * 
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String frase;
        System.out.println("Ingrese una frase, y finalicela con punto.");
        frase = leer.nextLine();
        int largo = frase.length();
        while(frase.charAt(largo-1)!='.'){
            System.out.println("Por Favor, ingrese la frase nuevamente y finalice con punto...");
            frase = leer.nextLine();
            largo = frase.length();
            }
        caracter(frase);
        System.out.println("");
    }
    public static void caracter(String frase){
        int longi = frase.length();
        for (int i=0;i<longi;i++){
            String letra = frase.substring(i,i+1);
            switch (letra){
                case "A":
                case "a":
                    letra = "@";
                    System.out.print(letra);
                    break;
                case "E":
                case "e":
                     letra = "#";
                     System.out.print(letra);
                     break;
                case "I":
                case "i":
                    letra = "$";
                    System.out.print(letra);
                    break;
                case "O":
                case "o":
                    letra = "%";
                    System.out.print(letra);
                    break;
                case "U":
                case "u":
                    letra = "*";
                    System.out.print(letra);
                    break;
                default:
                    System.out.print(letra);           
        }
            System.out.print("");
        }
        
    }
}
