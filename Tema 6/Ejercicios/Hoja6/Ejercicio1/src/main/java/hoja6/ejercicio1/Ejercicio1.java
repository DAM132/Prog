/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja6.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        EntidadBancaria eb = new EntidadBancaria();
        int opcion=0;
        

        do {
            System.out.println("\n--- MENÚ GESTIÓN DE SERIES ---");
            System.out.println("1. Abrir una cuenta nueva.");
            System.out.println("2. Ver un listado de las cuentas disponibles.");
            System.out.println("3. Obtener los datos de una cuenta concreta con toda su información.");
            System.out.println("4. Obtener los datos de una cuenta concreta con toda su información.");
            System.out.println("5. Retirar efectivo de una cuenta.");
            System.out.println("6. Consultar los clientes del banco de cierta edad.");
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
