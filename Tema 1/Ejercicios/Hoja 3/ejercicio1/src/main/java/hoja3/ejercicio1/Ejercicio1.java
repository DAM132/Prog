/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        double base,iva;
        Scanner in=new Scanner(System.in);
        System.out.println("Dime el valor de la base: ");
        base=in.nextDouble();
        System.out.println("Dime el precio del iva: ");
        iva=in.nextDouble();
        System.out.printf("Precio del iva es: %,.4f" ,base*iva/100);
        System.out.println("Precio total es" + (base*iva/100+base));
        
    }
}
