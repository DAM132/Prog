/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package examen.menu;

import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Menu {

    public static void main(String[] args) {
Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        do{
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");
            
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opción 1");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opción 2");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opción 3");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }

            }
        
        while (!salir) ;
    }
}


