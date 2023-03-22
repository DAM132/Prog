/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3colecciones.ejercicio1;

/**
 *
 * @author DAM103
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Mundo m=new Mundo();
        m.añadir("España");
        m.añadir("Francia");
        m.añadir("Portugal");
        m.añadir("España");
        m.añadir("Italia");
        m.añadir("Andorra");
        
        System.out.println(m.listar());
        
        m.eliminar("Francia");
        System.out.println(m.listar());
    }
}
