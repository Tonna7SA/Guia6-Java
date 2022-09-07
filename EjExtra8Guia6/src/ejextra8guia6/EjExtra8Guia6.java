/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra8guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
/*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
*/
public class EjExtra8Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int pares=0,impares=0;
        boolean bandera=true;
        System.out.println("Ingrese numeros enteros al azar:");
        do{
        int numero = leer.nextInt();
            if(numero>0 && numero%5==0){
                System.out.println("Se encontro un multiplo de 5, se termina la secuencia");
                bandera=false;
                break;
            }
            if(numero>0 && numero%2==0){
            pares++;
            }else if(numero>0 && numero%2==1)
                impares++;
        
        }while(bandera!=false);
        System.out.println("La cantidad de numeros pares ingresados son: "+pares);
        System.out.println("La cantidad de numeros impares ingresados son: "+impares);
        System.out.println("La cantidad total de numeros ingresados es: "+(pares+impares));
    }
        
    
}
