/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja3.ejercicio5;

import java.time.DateTimeException;

/**
 *
 * @author Ginés
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Tienda t = new Tienda();
        for (int i = 0; i < 5; i++) {
          
      
        try {
 
            Libro l = new Libro(20+i, "test"+i, "ifdsfs"+i, 5+i, 1+i, 2005+i);

            if (t.insertarPublicacion(l)) {
                System.out.println("Insercion realizada");
            } else {
                System.out.println("No se ha realizado");
            }
        } catch (DateTimeException ex) {
            System.out.println("Fecha incorrecta");
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Disco d= new Disco(20+i, "test"+i, "ifdsfs"+i, 10+i, 1+i, 2004+i);

            if (t.insertarPublicacion(d)) {
                System.out.println("Insercion realizada");
            } else {
                System.out.println("No se ha realizado");
            }
        } catch (DateTimeException ex) {
            System.out.println("Fecha incorrecta");
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
        
        
        
        System.out.println(t.mostrar());
          }
    
    

}
