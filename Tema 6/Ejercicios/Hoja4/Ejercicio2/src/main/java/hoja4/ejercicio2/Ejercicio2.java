/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja4.ejercicio2;

/**
 *
 * @author Ginés
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Agenda a= new Agenda();
        for (int i = 0; i < 10; i++) {
            Personas p= new Personas("test"+i,"test"+i,"71901092"+i);
            a.añadir(p);
        }
        
        System.out.println(a.mostrarAgenda());
        
        System.out.println(a.buscar("719010920"));
        
        System.out.println(a.modicarPersona("719010920", "719010100"));
        
                System.out.println(a.mostrarAgenda());
    }
    
}
