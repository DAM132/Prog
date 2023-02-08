/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja6.ejercicio1;

/**
 *
 * @author Ginés
 */
public class Ejercicio1 {

    public static void main(String[] args) {
DeDos dos= new DeDos();
        System.out.println("Imprime 5 DeDos");
        for (int i = 0; i < 5; i++) {
            System.out.println(dos.getSiguiente());
        }
        System.out.println("Reinicio");
        dos.reiniciar();
        for (int i = 0; i < 5; i++) {
            System.out.println(dos.getSiguiente());
        }
        
        dos.setComenzar(100);
        
           for (int i = 0; i < 5; i++) {
            System.out.println(dos.getSiguiente());
        }
           
           System.out.println("Elemento anterior" +dos.getAnterior());
        
           
           Detres tres= new Detres();
        System.out.println("Imprime 5 DeDos");
        for (int i = 0; i < 5; i++) {
            System.out.println(tres.getSiguiente());
        }
        System.out.println("Reinicio");
        tres.reiniciar();
        for (int i = 0; i < 5; i++) {
            System.out.println(tres.getSiguiente());
        }
        
        tres.setComenzar(100);
        
           for (int i = 0; i < 5; i++) {
            System.out.println(tres.getSiguiente());
        }
           
           
    }
}