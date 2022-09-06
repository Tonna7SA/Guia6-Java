/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
*/
package ejextra6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EjExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de personas a para medir su altura:");
        int personas = leer.nextInt();
        promedioaltura(personas, leer);
    }
    
public static void promedioaltura(int personas, Scanner leer){
    double suma=0,suma1=0,bajo=0;
    
    for(int i=1;i<=personas;i++){
        System.out.println("Persona N° "+i+" :");
        double altura = leer.nextDouble();
        if(altura<1.60){
            suma+=altura;
            bajo++;
        }else{
            suma1+=altura;
            
        }
    }
    System.out.println("El promedio de altura hasta 1,60 es de: "+(suma/bajo)+" mts." );
    System.out.println("El promedio de altura de las "+personas+" personas, es de: "+((suma+suma1)/personas)+" mts.");
}
}