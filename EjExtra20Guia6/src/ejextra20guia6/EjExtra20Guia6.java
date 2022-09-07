/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra20guia6;

/**
 *
 * @author User
 */
public class EjExtra20Guia6 {

    /**
     * @param args the command line arguments
     */
    /*Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
    */
    public static void main(String[] args) {
        int vector [] = new int [5];
        llenado(vector);
        impresion(vector);
    }
    public static void llenado(int vector []){
        for (int i = 0; i < 5; i++) {
            vector[i]=(int)(Math.random()*10);
            
        }
    }
    public static void impresion(int vector []){
        System.out.println("Impresion Vector");
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.print(vector[i]+" ");
            
        }
        System.out.println(" ");
    }
}
