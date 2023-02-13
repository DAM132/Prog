/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja7.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        int num1, num2;

        num1 = esEntero();
        num2 = esEntero();
        try {

            int resul = num1 / num2;
            
            System.out.println(resul);

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0");
        }

    }//fin del main

    public static int esEntero() {

        int numEntero = 0;
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

        return numEntero;

     }
    


}//fin de la clase
