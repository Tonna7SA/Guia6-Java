/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra21guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EjExtra21Guia6 {

    /**
     * @param args the command line arguments
     */
    /*Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double alumnos [] = new double [10];
        int i=0,aprobado=0,desaprobado=0;
        double nota1,nota2,integrador1,integrador2;
        System.out.println("Ingreso de Notas por Alumno:");
        do{
            System.out.println(" ");
            System.out.println("Alumno N° "+(i+1));
            System.out.println(" ");
            do{
            System.out.println("Nota 1° Trabajo Practico:");
            nota1 = leer.nextDouble();
            if(nota1<0 || nota1>10){
                System.out.println("Nota invalida, pruebe de nuevo");
            }
            }while(nota1<0 || nota1>10);
            nota1=nota1*0.10;
            do{
            System.out.println("Nota 2° Trabajo Practico:");
            nota2 = (leer.nextDouble());
            if(nota2<0 || nota2>10){
                System.out.println("Nota invalida, pruebe de nuevo");
            }
            }while(nota2<0 || nota2>10);
            nota2=nota2*0.15;
            do{
            System.out.println("Nota 1° Integrador:");
            integrador1=leer.nextDouble();
            if(integrador1<0 || integrador1>10){
                System.out.println("Nota invalida, pruebe de nuevo");
            }
            }while(integrador1<0 || integrador1>10);
            integrador1=integrador1*0.25;
            do{
            System.out.println("Nota 2° Integrador:");
            integrador2=leer.nextDouble();
            if(integrador2<0 || integrador2>10){
                System.out.println("Nota invalida, pruebe de nuevo");
            }
            }while(integrador2<0 || integrador2>10);
            integrador2=integrador2*0.50;
            double resultado = (nota1+nota2+integrador1+integrador2);
            alumnos[i]=resultado;
            i++;
        }while(i!=10);
        impresion(alumnos);
        for (int j = 0; j < 10; j++) {
            if(alumnos[j]>7){
                aprobado++;
            }else{
                desaprobado++;
            }
            
        }
        System.out.println("La cantidad de alumnos aprobados es: "+aprobado);
        System.out.println("");
        System.out.println("La cantidad de alumnos desaprobados es: "+desaprobado);
    }
    public static void impresion(double alumnos[]){
        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno N° "+i+": "+alumnos[i]+" ");
            
        }
    }
}
