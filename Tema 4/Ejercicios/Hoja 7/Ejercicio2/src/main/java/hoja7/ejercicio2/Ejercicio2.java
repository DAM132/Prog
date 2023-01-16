/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja7.ejercicio2;

/**
 *
 * @author Ginés
 */
public class Ejercicio2 {

    public static void main(String[] args) {
Veterinario v= new Veterinario();
v.añadir();
v.añadir();
System.out.println(v.mostrar());
        System.out.print("mayores");
        System.out.println(v.mostrarMayores());
        }
}
