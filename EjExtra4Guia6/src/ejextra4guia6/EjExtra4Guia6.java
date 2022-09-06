/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra4guia6;

import java.util.Scanner;

/**
 *
 * @author User
 */
/*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
*/
public class EjExtra4Guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 10, para su equivalente en numeros romanos");
        int numero = leer.nextInt();
        switch(numero){
            case 1:System.out.println("El numero "+numero+" es I");break;
            case 2:System.out.println("El numero "+numero+" es II");break;
            case 3:System.out.println("El numero "+numero+" es III");break;
            case 4:System.out.println("El numero "+numero+" es IV");break;
            case 5:System.out.println("El numero "+numero+" es V");break;
            case 6:System.out.println("El numero "+numero+" es VI");break;
            case 7:System.out.println("El numero "+numero+" es VII");break;
            case 8:System.out.println("El numero "+numero+" es VIII");break;
            case 9:System.out.println("El numero "+numero+" es IX");break;
            case 10:System.out.println("El numero "+numero+" es X");break;
            default:
                System.out.println("El numero tiene que ser entre 1 y 10");
                        
            
        }
    }
    
}
