/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3.ejercicio3;

/**
 *
 * @author Ginés
 */
public class Ejercicio3 {

    public static void main(String[] args) {
Circulo cir= new Circulo();
Cuadrado cua= new Cuadrado();

        System.out.println(cir.toString());
        System.out.println(cir.id);

Forma f=cir;
        System.out.println("Forma con un circulo" + f.toString());

    }
}
