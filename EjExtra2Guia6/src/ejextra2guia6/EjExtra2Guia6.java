/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra2guia6;

/**
 *
 * @author User
 */
/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
*/
public class EjExtra2Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int aux;
        System.out.println("Variables originales");
        System.out.println("La variable A = "+a);
        System.out.println("La variable B = "+b);
        System.out.println("La variable C = "+c);
        System.out.println("La variable D = "+d);
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        System.out.println("");
        System.out.println("Variables cambiadas");
        System.out.println("La variable A = "+a);
        System.out.println("La variable B = "+b);
        System.out.println("La variable C = "+c);
        System.out.println("La variable D = "+d);
    }
    
}
