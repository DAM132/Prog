/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nuria
 */
public class Ejercicio5a {

    public static int dividir(int dividendo, int divisor) throws ArithmeticException {
        int resul = 0;
        resul = dividendo / divisor;
        return resul;
    }

    public static int IntroEntero() {
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        return num;
    }

    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        int resul = 0;
        boolean valido = false;

        do {
            System.out.println("Introduce un valor entero: ");
            try {
                num1 = IntroEntero();
                valido = true;
            } catch (InputMismatchException io) {
                System.err.println("Tipo de dato incorrecto, vuelve a intentarlo.");

            }
        } while (!valido);
        valido = false;
        do {
            System.out.println("Introduce un valor entero: ");
            try {
                num2 = IntroEntero();
                valido = true;
            } catch (InputMismatchException io) {
                System.err.println("Tipo de dato incorrecto, vuelve a intentarlo.");

            }
        } while (!valido);

        try {
            resul = dividir(num1, num2);
            System.out.println("El resultado es " + resul);
        } catch (ArithmeticException e) {
            System.out.println("Error en la division");
        }
        
    }
}
