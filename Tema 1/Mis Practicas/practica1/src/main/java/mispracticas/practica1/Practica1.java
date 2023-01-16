/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mispracticas.practica1;

import java.util.Scanner;

/**
 *
 * @author jdcg1
 */
public class Practica1 {
    public enum sino {SI, NO};
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String localizacion;
        String nombre;
        int edad;
        boolean trabajas;
        
        System.out.println("localizacion: ");
        localizacion=teclado.nextLine();
        System.out.println("Nombre: ");
        nombre=teclado.nextLine();
        System.out.println("Edad: ");
        edad=teclado.nextInt();
        System.out.println("Trabajas: ");
        trabajas=teclado.nextBoolean();
               
           
    }
}
