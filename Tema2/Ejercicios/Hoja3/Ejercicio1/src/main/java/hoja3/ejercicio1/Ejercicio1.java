/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Gines
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Finanzas f1=new Finanzas();
        Scanner in = new Scanner();
        double euros,euros1;
        System.out.println("cantidad en euros");
        
        euros1= f1.eurosToDolares(in.nextDouble());
        System.out.println("Es en dolares" +euros1);
       
        
        
       

        }
}
