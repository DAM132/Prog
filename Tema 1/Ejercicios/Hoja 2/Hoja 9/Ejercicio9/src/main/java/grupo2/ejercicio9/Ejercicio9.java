/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package grupo2.ejercicio9;

import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        double cateto1;
                double cateto2;

         Scanner teclado=new Scanner(System.in);
           System.out.println("Valor del cateto: ");
        cateto1=teclado.nextDouble();
       System.out.println("Valor del cateto: ");
        cateto2=teclado.nextDouble();

         
        double cateto3= Math.pow(cateto1, 2)+ Math.pow(cateto2, 2);
        
        System.out.println("El valor de H es" + Math.sqrt(cateto3));
    }
}
