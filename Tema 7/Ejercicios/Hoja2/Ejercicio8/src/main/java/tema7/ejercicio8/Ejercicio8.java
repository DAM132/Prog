/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema7.ejercicio8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author DAM132
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        File faux = new File("aux.txt");
        System.out.println("Encripto");
        Seguridad.encriptar(faux);

    }
}
