/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Entrada {
    public static String pedirNacionalidad(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce Nacionalidad serie: ");
        String nac = scanner.nextLine();

        return nac;

    }

    public static String pedirNombre() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre de la serie: ");
        String nombre = scanner.nextLine();

        return nombre;

    }

    public static Boolean estaFinalizada() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Esta finalizada?");
        char finalizada = scanner.next().charAt(0);
        boolean bfinalizada = false;
        if (finalizada == 's') {
            bfinalizada = true;
        }
        return bfinalizada;
    }

    public static int pedirntemp() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantas temporadas tiene");
        int ntemp = scanner.nextInt();

        return ntemp;

    }

    public static Tematica entradaT() {
         Tematica t= null;
       Scanner scanner = new Scanner(System.in);

        System.out.println("1. Policial");
        System.out.println("2. Comedia");
        System.out.println("3. Infantil");
        System.out.println("4. Aventura");
        System.out.print("Elige una opción: ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                 t= Tematica.Policial;
                break;
            case 2:
                 t= Tematica.Comedia;
                break;
            case 3:
                 t= Tematica.Infantil;
                break;
                   case 4:
                 t= Tematica.Policial;
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        return t;
    }


    
}
