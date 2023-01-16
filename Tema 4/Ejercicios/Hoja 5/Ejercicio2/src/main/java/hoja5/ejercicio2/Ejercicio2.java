/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja5.ejercicio2;

/**
 *
 * @author Ginés
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Sopa s= new Sopa();
        s.mostrar();
        s.setPalabra("TEST", 1, 3, -4);
        System.out.println("");
        s.mostrar();
    }
}
