/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja5.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GestorSeries gs = new GestorSeries();
        int opcion=0;
        

        do {
            System.out.println("\n--- MENÚ GESTIÓN DE SERIES ---");
            System.out.println("1. Añadir serie");
            System.out.println("2. Eliminar serie");
            System.out.println("3. Ver series almacenadas");
            System.out.println("4. Añadir capítulo a una serie ya almacenada (pide nombre por teclado)");
            System.out.println("5. Borrar capítulo de una serie ya almacenada (pide nombre por teclado)");
            System.out.println("6. Ver capítulos de una serie ya almacenada (pide nombre por teclado)");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
        
           

            switch (opcion) {
                case 1:

                    gs.crearSerie();

                    break;
                case 2:
                    gs.eliminarSerie();
                    break;
                case 3:
                    gs.verSeries();
                    break;
                case 4:

                    gs.crearCapitulo();
                    break;
                case 5:
                    gs.eliminarCapitulo();
                    break;
                case 6:
                    gs.verCapitulos();
                    break;
                case 7:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción no valida");
            }}
            while(opcion!=7);
        }
        }

        
  
    

