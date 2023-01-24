/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio1;

/**
 *
 * @author Ginés
 */
public class Ejercicio1 {

    public static void main(String[] args) {
Empleado e= new Empleado(100);
Encargado e1=new Encargado(100);
        System.out.println("Sueldo empleado");
        System.out.println(e.getSueldo());
        System.out.println("sueldo de encargado");
        System.out.println(e1.getSueldo());
        
    }
}
