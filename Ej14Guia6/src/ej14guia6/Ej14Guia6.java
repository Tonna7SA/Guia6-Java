/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*EJERCICIO 14
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo */

package ej14guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ej14Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] colegas = new String[8];
        Scanner leer = new Scanner(System.in);
        for (int i=0;i<8;i++){
            System.out.println("Ingrese el nombre del compañero N° "+(i+1)+ ":");
            colegas[i]=leer.nextLine();
        }
        System.out.println("Lista de Compañeros:");
        for (int i=0;i<8;i++){
            System.out.println(colegas[i]);
        }
    }
    
}
 