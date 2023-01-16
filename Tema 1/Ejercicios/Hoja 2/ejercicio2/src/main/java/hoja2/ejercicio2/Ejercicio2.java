/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio2;

/**
 *
 * @author DAM103
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        boolean w, x=true, y=true,z=false;
    w=x && y || x && z || y &&z;
    
    System.out.println("El resultado es:"+w); //como hay un true entre las & y ||, la w se queda con un true.
    }
}
