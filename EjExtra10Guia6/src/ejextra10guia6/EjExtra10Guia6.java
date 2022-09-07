/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra10guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EjExtra10Guia6 {

    /**
     * @param args the command line arguments
     */
    /*Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int aux=0;
        int resultado=0;
        System.out.println("Adivine la Multiplicacion");
        int numero1 = (int)(Math.random()*10)+1;
        int numero2 = (int)(Math.random()*10)+1;
        do{
        System.out.println(numero1+" x "+numero2+" = ");
        aux = numero1*numero2;
        resultado = leer.nextInt();
        if(aux==resultado){
            System.out.println("Muy bien, usted es un buen multiplicador!!!");
            break;
        }else{
            System.out.println("Me parece que esta equivocado...");
            System.out.println("Pruebe otra vez...");
        }
    }while(aux != resultado);
    }
}
