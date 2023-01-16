/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Calculo c= new Calculo();
        Scanner in= new Scanner(System.in);
        int opc;
        do{
        System.out.println("opciones");
        System.out.println("1.cuenta atras");
        System.out.println("2. positivos y negativos");
            System.out.println("3. Factorial");
            System.out.println("4. Caracteres");
            System.out.println("5. media aritmetica");
            System.out.println("6. Salir");
            System.out.println("Elige una opcion");

            opc = in.nextInt();

            switch (opc) {
                case 1:
                    c.metodo1();
                    break;
                case 2:
                    c.metodo2();
                    break;

                case 3:
                    c.metodo3();
                    break;
                case 4:
                    c.metodo4();
                    break;
                case 5:
                    c.metodo5();
                    break;
                case 6:
                    System.out.println("adios");
                    break;
                default:
                    System.out.println("Error en la opc");
                    break;
            }
        } while (opc != 6);
    }
}
