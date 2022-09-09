/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra22guia6;

/**
 *
 * @author User
 */
public class EjExtra22Guia6 {

    /**
     * @param args the command line arguments
     */
    /*Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
    */
    public static void main(String[] args) {
        int suma=0;
        int matriz [][]=new int[3][5];
        System.out.println("Matriz");
        System.out.println("");
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j <matriz[0].length; j++) {
             matriz[i][j]=(int)(Math.random()*10);
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j <matriz[0].length; j++) {
                suma+=matriz[i][j];
            }
        }
        System.out.println("");
        System.out.println("La suma de todos los elementos de la Matriz es: "+suma);
        System.out.println("");
    }
    
}
