/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2colecciones.ejercicio1;


/**
 *
 * @author DAM103
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Academia a=new Academia();
        
        int opc=0;
        
        do{
            System.out.println("Menu de opciones:");
            System.out.println("1.- Añadir un nuevo curso al final");
            System.out.println("2.- Insertar curso en cualquier posicion");
            System.out.println("3.- Borrar curso");
            System.out.println("4.- Modificar las horas de un curso");
            System.out.println("5.- Mostrar");
            System.out.println("6.- Salir");
            
            opc=Teclado.IntroEntero("Introduce el numero de opcion");
            
            switch(opc){
                case 1 -> a.añadirAlFinal(new Curso());
                case 2 -> a.insertarEnCualquierPosicion(new Curso());
                case 3 -> a.borrar(Teclado.IntroString("Introduce el codigo a borrar"));
                case 4 -> a.modificarHoras(Teclado.IntroString("Introduce codigo a modificar"));
                case 5 -> System.out.println(a.mostrar());
                case 6 -> System.out.println("Adios");
                default -> System.out.println("Error en la selección");
                    
            }
        }while(opc!=6);
    }
}
