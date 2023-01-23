/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja1.ejercicio3;

/**
 *
 * @author Ginés
 */
public class Ejercicio3 {

    public static void main(String[] args) {
     AparatoElectrico p= new AparatoElectrico(150);
    p.apagar();
    p.enciende();
        System.out.println(AparatoElectrico.getConsumoTotal());    
        
        
      
    }
}
