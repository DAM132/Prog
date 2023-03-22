/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3.ejercicio4;

/**
 *
 * @author Ginés
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Jornadas j = new Jornadas();

        Partidos p1 = new Partidos("Barcelona", "Madrid", 10, 0);
        Partidos p2 = new Partidos("Barcelona", "Madrid", 10, 11);
        Partidos p3 = new Partidos("Barcelona", "Madrid", 10, 10);

        j.add(p1);
        j.add(p2);
        j.add(p3);

        System.out.println("Mostrar jornada");

        j.mostrarJornada();

        System.out.println("Eliminio");

        j.eliminarPartidos();

        j.mostrarJornada();

    }
}
