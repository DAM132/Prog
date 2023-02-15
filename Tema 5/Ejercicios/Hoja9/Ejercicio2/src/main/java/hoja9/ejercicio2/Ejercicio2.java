/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja9.ejercicio2;

/**
 *
 * @author Ginés
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Prueba p= new Prueba();
        
        p=null;
        try{
               p.get(); 
        }catch(NullPointerException e){
            System.out.println("error"+e.getMessage());
        }
        
    
    }
}
