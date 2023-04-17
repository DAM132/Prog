/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema7.ejercicio2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DAM132
 */
public class Ejercicio2 {

    public static void main(String[] args) {
   FileWriter fr;
        BufferedWriter br = null;
        String frase;
        Scanner e = new Scanner(System.in);
        System.out.println("Escribe lo que te apetezca para añadir a otrofichero.txt");
        frase = e.nextLine();
        try {
            fr = new FileWriter("otroFichero.txt", true);
            br = new BufferedWriter(fr);
            br.write(frase);
            br.write(System.lineSeparator());
        } catch (IOException ex) {
            System.err.println(ex.toString());
        } finally {
            if (br != null)
		try {
                br.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar");
            }
        }
        }
}
