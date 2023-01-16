/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja4.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Operaciones o=new Operaciones(28);
        int opc;
        Scanner in= new Scanner(System.in);
        do {
            System.out.println("opciones");
            System.out.println("1- contar cifras");
            System.out.println("2- los 10 primeros multiplos");
            System.out.println("3- numero perfecto");
            System.out.println("4- salir");
            opc= in.nextInt();
            
       
       switch(opc){
           case 1 -> o.metodo1();
           case 2 -> o.metodo2();
           case 3 -> o.metodo3();
           case 4 -> System.out.println("Salir");
           default -> System.out.println("error shur");
       }
        }
        while(opc!=4);
        
    }
}
