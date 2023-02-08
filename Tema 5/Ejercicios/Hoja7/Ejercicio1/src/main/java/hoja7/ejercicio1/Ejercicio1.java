/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja7.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int v;
        int o;
        boolean aux = true;
        Scanner in = new Scanner(System.in);
        
        do {
System.out.println("Dime un numero");
            try {

                v = in.nextInt();
                aux=false;
                
            } catch (InputMismatchException exc) {
                System.out.println("Tiene que ser un numero entero =)");
                in.nextLine();
            
               
            }
           

        } while (aux);
    }

}
