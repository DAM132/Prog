/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja1string.ejercicio3;

import java.util.Locale;

/**
 *
 * @author Gines
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        String cadena = "Hola que tal estais";

        cadena = cadena.replace("a", "o");
        cadena = cadena.replace("e", "o");
        cadena = cadena.replace("u", "o");
        cadena = cadena.replace("i", "o");
        System.out.println("Reemplazo" + cadena);
        
               //2º forma String regexp="[aeiou]";
        // System.out.println(cadena.replaceAll(regexp, "o"));

    }
}
