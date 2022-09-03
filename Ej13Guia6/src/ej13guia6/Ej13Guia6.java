/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ej13Guia6 {

    /**
     * @param args the command line arguments
     */
    /* EJERCICIO 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
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
