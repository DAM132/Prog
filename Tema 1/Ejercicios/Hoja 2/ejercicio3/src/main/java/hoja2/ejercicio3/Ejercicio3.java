/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author DAM103
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        double precio_euros, precio_pesetas;
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Dime el precio en €");
        precio_euros=teclado.nextDouble();
        precio_pesetas=precio_euros*166.386;
        System.out.println ("Precio en  Euros"+precio_euros);
        System.out.printf ("Precio en pesetas : %,.2f",precio_pesetas);
               }
}
