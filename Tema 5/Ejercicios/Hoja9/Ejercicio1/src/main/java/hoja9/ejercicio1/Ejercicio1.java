/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja9.ejercicio1;

/**
 *
 * @author Ginés
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        try{
            throw new Exception("Soy una excepcion");
        } catch(Exception e){
            System.out.println("Se produjo" +e.getMessage());
        } finally{
            System.out.println("Esto se ejecuta si o si ");
        }
        
    }
}
