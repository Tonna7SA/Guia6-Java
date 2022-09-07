/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra16guia;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EjExtra16Guia {

    /**
     * @param args the command line arguments
     */
    /*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a encuestar:");
        int cantidad = leer.nextInt();
        String nombres[] = new String[cantidad];
        int edad[] = new int[cantidad];
        personas(cantidad, nombres, edad, leer);

    }

    public static void personas(int cantidad, String nombres[], int edad[], Scanner leer) {
        boolean bandera = false;
        int j=0;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el Nombre de la persona N° " + (i + 1));
            nombres[i] = leer.next();
            System.out.println("Ingrese la edad de " + nombres[i] + ":");
            edad[i] = leer.nextInt();

        }
        System.out.println(" ");
        System.out.println("Listado de las " + cantidad + " personas ingresadas");
        do{
            if(edad[j]>18){
            System.out.println(nombres[j]+" es mayor de edad.");
            j++;
            }else{
                System.out.println(nombres[j]+" es menor de edad.");
                j++;
            }
            System.out.println("Desea ver la siguiente persona (Si/No)");
            String palabra=leer.next();
            if(palabra.equalsIgnoreCase("no")){
                System.out.println("Hasta Luego...");
                j=cantidad;
            }
            
            
        }while(j!=cantidad);
    }
}
