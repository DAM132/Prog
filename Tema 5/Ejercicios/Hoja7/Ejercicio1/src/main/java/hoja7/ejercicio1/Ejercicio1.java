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
        int numEntero;
        double numDouble;
        boolean aux = false;
        Scanner in = new Scanner(System.in);

        do {
            try {
                System.out.println("Dime un numero");
                numEntero = in.nextInt();
                aux = true;

            } catch (InputMismatchException exc) {
                System.out.println("Tiene que ser un numero entero champion =)");
                in.nextLine();

            }

        } while (!aux);

        System.out.println("Ahora si es correcto");
        
        
        aux=false;
         do {
            try {
                System.out.println("Dime un numero");
                numDouble = in.nextDouble();
                aux = true;

            } catch (InputMismatchException exc) {
                System.out.println("Tiene que ser un numero entero champion =)");
                in.nextLine();

            }

        } while (!aux);

        System.out.println("Ahora si es correcto");
    


    }
}
    
     
    
   



