/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja6.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Ejercicio3 {

    public static void main(String[] args) {
Agenda a= new Agenda(2);
Scanner in= new Scanner(System.in);
int opc;

do{
    System.out.println("""
                       1- Nuevo contacto
                       2- Mostrar Agenda
                       3-Buscar Contacto
                       4-Ver el numero de contactos agenda
                       5-Modificar
                       6-Salir
                       """);
    opc = in.nextInt();
    switch (opc) {
        case 1 -> a.insertar();
        case 2 -> a.mostrar();
        case 3 -> a.buscar();
        case 4 -> a.usuarios();
        case 5 -> a.modificar();
        case 6 -> System.out.println("Salida!");
    default -> System.out.println("No es una de las opciones");
}
}

   

while(opc!=6);
        
        }
}
