/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja1.ejercicio3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAM132
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Dime la ruta");
        String ruta = in.next();
        File f1 = new File("D:\\Usuarios\\DAM132\\Documents\\prueba");

        if (!f1.exists()) {

            try {
                System.out.println("Creamos el fichero");
                if (f1.createNewFile()) {
                    System.out.println("Se crea");
                }
            } catch (IOException ex) {
                System.out.println("Error al crear el fichero");
            }

        } else {
            System.out.println("Ya existe");
        }
    }
}
