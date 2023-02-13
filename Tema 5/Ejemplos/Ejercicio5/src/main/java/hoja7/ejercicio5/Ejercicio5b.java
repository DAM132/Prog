/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja7.ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nuria
 */
public class Ejercicio5b {
 public static int dividir(int dividendo, int divisor) {
        int resul = 0;
        try {
            if (divisor == 0) {
                throw new ArithmeticException();
            }
            resul = dividendo / divisor;
        } catch (ArithmeticException Ae) {
            System.out.println("Division entre cero, no se realiza la operación");
        }
        return resul;
    }


    
    public static int IntroEntero(){
    Scanner teclado = new Scanner(System.in);
        boolean valido = false;
        int num=0;
        
        do {
            System.out.println("Introduce un valor entero: ");
            try {
                num = teclado.nextInt();
                valido = true;
            } catch (InputMismatchException io) {
                System.err.println("Tipo de dato incorrecto, vuelve a intentarlo.");
                teclado.next();
            }
        } while (!valido);
        return num;
    }
    
    
    
    public static void main(String[] args) {
        int num1,num2 = 0;
        int resul=0;
        num1=IntroEntero();
        num2=IntroEntero();
        resul=dividir(num1,num2);
        System.out.println("El resultado es "+resul);
    }
    
}
