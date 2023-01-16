/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja6.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Ejercicio2 {

    public static void main(String[] args) {
Banco b= new Banco(10);
Scanner in= new Scanner(System.in);
int opc;

do{
    System.out.println("1- Ingresar\n"
            + "2- Mostrar\n"
            + "3-Buscar\n"
            + "4-Eliminar\n"
            + "5-Salir\n");
    opc = in.nextInt();
switch(opc){
    case 1 -> b.ingresar();
    case 2 -> b.mostrar();
    case 3 -> {
        System.out.println("Dime el numero de usuario");
        b.buscar(in.nextInt());
    }
    
    case 4 ->{
        System.out.println("Dime el numero de usuario");
        b.eliminar1(in.nextInt());
    }
    case 5 -> System.out.println("");
    default -> System.out.println("No es una de las opciones");
}
}

   

while(opc!=5);
        

    }
}
