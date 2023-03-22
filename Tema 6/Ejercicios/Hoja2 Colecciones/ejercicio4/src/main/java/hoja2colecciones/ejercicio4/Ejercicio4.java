/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2colecciones.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author DAM103
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Servicio s=new Servicio();
        int opc=0;
        
        do{
            System.out.println("Menu de opciones:");
            System.out.println("1.- Añadir Cliente");
            System.out.println("2.- Atender Cliente");
            System.out.println("3.- Tiempo medio de espera de clientes no atendidos");
            System.out.println("4.- Tiempo medio de espera de clientes ya atendidos");
            System.out.println("5.- Mostrar Clientes");
            System.out.println("6.- Adios");
            
            opc=teclado.nextInt();
            
            switch(opc){
                case 1 -> System.out.println("Opcion 1");
                case 2 -> System.out.println("Opcion 2");
                case 3 -> System.out.println("Media: "+s.tiempoMedioEnEspera());
                case 4 -> System.out.println("Media: "+s.tiempoMedioAtendidos());
                case 5 -> System.out.println(s.mostrarEstado());
                case 6 -> System.out.println("Adios");
                default -> System.out.println("Error en la selección");
                    
            }
        }while(opc!=6);
    }
}
