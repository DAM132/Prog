/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio2;

/**
 *
 * @author Ginés
 */
public class Ejercicio2 {

    public static void main(String[] args) {
Articulo [] a= new Articulo[10];
        System.out.println("perecedero");
        for (int i = 0; i < a.length; i++) {
            a[i]= new Perecedero();
        }
        
        System.out.println("En promocion");
        for (int i = 5; i < a.length; i++) {
            a[i]=new EnPromocion();
        }

    }
}
