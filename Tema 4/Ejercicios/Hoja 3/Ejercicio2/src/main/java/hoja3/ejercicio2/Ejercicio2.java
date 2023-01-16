/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3.ejercicio2;

/**
 *
 * @author Ginés
 */
public class Ejercicio2 {

    public static void main(String[] args) {
Curso c= new Curso(4);
       c.Iniciales();
       c.desplaza();
      c.verNombre(0);
       if(c.EsDaw()==true){
           System.out.println("Verdadero");
       }
       else{
           System.out.println("Falso");
       }
    }
}
