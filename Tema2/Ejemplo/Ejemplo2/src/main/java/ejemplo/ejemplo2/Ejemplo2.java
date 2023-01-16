/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejemplo.ejemplo2;

/**
 *
 * @author Gines
 */
public class Ejemplo2 {

    public static void main(String[] args) {
        String modulo = "programación";
        String ciclo = new String();
        ciclo = "Desarrollo de Aplicaciones Multiplataforma";
        char c = ciclo.charAt(0);

        System.out.println("*****ASIGNACION DE VALORES*****");
        String introduccion;
        introduccion = "Trataremos inicialmente los 'String' para el manejo de cadenas. Son muy \"IMPORTANTES\"";

        System.out.println("El primer caracter de ciclo es: " + c);
        System.out.println("El quinto caracter de ciclo es: " + ciclo.charAt(4));

        System.out.println("Longuitud de la cadena " + ciclo.length());

        System.out.println("*****Extraccion de una subcadena*****");
        System.out.println("Subcadena de la cadena ciclo entre las posiciones 3 y 6: " + ciclo.substring(3, 6));

        //equals
        System.out.println("*****COMPARACIÓN ENTRE CADENAS*****");
        String texto1 = "Buenos días";
        String texto2 = new String("Buenos días");
        System.out.println("¿Las cadenas son iguales?: " + texto1.equals(texto2));
        System.out.println("¿Las cadenas son iguales?: " + texto1 == texto2); // El resultado de esta instrucción puede ser incorrecto.

        System.out.println("*****COMPARACIÓN ENTRE CADENAS*****");
        String texto3 = "Buenos días";
        String texto4 = new String("BUENOS DÍAS");
        System.out.println("¿Las cadenas son iguales?: " + texto3.equalsIgnoreCase(texto4));

        //if
        System.out.println("*****COMPARACIÓN ENTRE CADENAS*****");
        String bdias = "Buenos dias";
        String bdiascomp = new String("Buenos dias");
        if (bdias.compareTo(bdiascomp) > 0) {
            System.out.println("texto1 es superior a texto2");
        } else if (bdias.compareTo(bdiascomp) < 0) {
            System.out.println("texto1 es inferior a texto2");
        } else {
            System.out.println("texto1 y texto2 son iguales");
        }
    }
}
