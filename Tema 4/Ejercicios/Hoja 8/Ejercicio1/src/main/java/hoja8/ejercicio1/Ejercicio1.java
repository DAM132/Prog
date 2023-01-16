/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja8.ejercicio1;

/**
 *
 * @author Ginés
 */
public class Ejercicio1 {

    public static void main(String[] args) {
Alumno a= new Alumno();
        System.out.println("Saca nota Mayor");
        System.out.println(a.mayor());
        System.out.println("Saca nota menor");
        System.out.println(a.menor());
        System.out.println("Saca tres mejores notas");
        
        for (int i = 0; i < a.tresMejores().length; i++) {
            System.out.println(a.tresMejores()[i]);
            System.out.println("");
            
        }
        }
}
