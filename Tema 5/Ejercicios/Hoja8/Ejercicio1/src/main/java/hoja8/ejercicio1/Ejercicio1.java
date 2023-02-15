/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja8.ejercicio1;

import java.util.Scanner;


/**
 *
 * @author Ginés
 */
public class Ejercicio1 {

    public static void main(String[] args) throws Exception {
        Alumno [] a= new Alumno [4];
      
        for (int i = 0; i < a.length; i++) {
              System.out.println("notas");
       
            System.out.println("Dime las notas que quieres introducir del alumno");
             a[i]= new Alumno(introNotas());
           
      
            
        }
        
        for (Alumno a1 : a) {
            System.out.println(a1.mostrar());
        }
    }
    
    public static int introNotas() throws Exception{
        Scanner in= new Scanner(System.in);
        return Alumno.esEntero();
    }
    
    
      
}
