/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja9.ejercicio4;

/**
 *
 * @author Ginés
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        
        MiExcepcion me=new MiExcepcion("test");
        try{
            throw new MiExcepcion("test");
            
        }catch(MiExcepcion e){
            System.out.println(e.getError());
        }
           
       
      }
}
