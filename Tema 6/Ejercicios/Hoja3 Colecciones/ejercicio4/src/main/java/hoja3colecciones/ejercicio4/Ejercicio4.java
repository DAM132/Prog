/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja3colecciones.ejercicio4;

/**
 *
 * @author DAM103
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Carrera c=new Carrera();
        
        int opc=0;
        
        do{
            System.out.println("Menu de opciones:");
            System.out.println("1.- Añadir atleta");
            System.out.println("2.- Tiempo medio de los corredores");
            System.out.println("3.- Dar la vuelta");
            System.out.println("4.- Mostrar");
            System.out.println("5.- Salir");
            
            opc=Teclado.IntroEntero("Elige la opcion que deseas: ");
            
            switch(opc){
                case 1 -> c.añadir(new Atleta());
                case 2 -> System.out.println("Tiempo medio de corredores: " + c.tiempoMedio());
                case 3 -> 
                { 
                    System.out.println("Damos la vuelta a la lista de corredores");
                    c.darVuelta();
                } 
                case 4 ->
                {
                    System.out.println("Lista de Atletas");
                    System.out.println(c.mostrar());
                }
                case 5 -> System.out.println("Adios");
                default -> System.out.println("Error en la selección");
                    
            }
        }while(opc!=5);
    }
}
