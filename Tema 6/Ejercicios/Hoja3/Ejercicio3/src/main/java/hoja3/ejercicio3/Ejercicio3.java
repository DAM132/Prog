/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3.ejercicio3;

/**
 *
 * @author Ginés
 */
public class Ejercicio3 {

    public static void main(String[] args) {
Agenda a= new Agenda();
Personas p = new Personas("Gines","priede","71901093B");
Personas p1 = new Personas("Gines","priede","71901092X");

a.addPersona(p);
a.addPersona(p1);
a.mostrarAgenda();
a.borrarPersona("71901092X");
a.buscarAgenda("71901093B");
a.modificarAgenda(p);
System.out.println("Muestro la agenda");
a.mostrarAgenda();
    }
}
