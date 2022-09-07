/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra9guia6;

import java.util.Scanner;


/**
 *
 * @author User
 */
/*Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
*/
public class EjExtra9Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo");
        int numero1 = leer.nextInt();
        while(numero1 < 0){
            System.out.println("Entero!!! y Positivo!!!");
            numero1 = leer.nextInt();
        }
        System.out.println("Ingrese un numero para dividir por el primero ingresado");
        System.out.println("Recuerde, entero, positivo y menor a "+numero1);
        int numero2 = leer.nextInt();
        while(numero2 < 0 || numero2 > numero1){
            System.out.println("Entero!!! Positivo!!! y menor a "+numero1+" !!!");
            numero2 = leer.nextInt();
        }
        Divisionporresta(numero1,numero2);
    }
    
    public static void Divisionporresta(int numero1, int numero2){
        int resultado=0, contador=0,aux=0;
        aux = numero1;
        do{
            resultado=numero1-numero2;
            numero1=resultado;
            contador++;
        }while(resultado>=numero2);
        System.out.println("Residuo de la division "+contador);
        System.out.println("Cociente de la division "+resultado);
        System.out.println(+aux+" / "+numero2+" = "+contador+","+resultado);
     }
 }
