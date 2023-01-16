/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja4.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int opc = 0;
        Calculo c=new Calculo();
       Scanner in= new Scanner(System.in);
     do{  
        System.out.println("menu");
        System.out.println("metodo1");
        System.out.println("metodo2");
        System.out.println("metodo3");
        System.out.println("metodo4");
        System.out.println("5 salir");
        System.out.println("introduce una opcion");
     
        
        switch(opc){
            case 1: c.metodo1();
            break;
            case 2: c.metodo2();
            break;
            case 3: c.metodo3();
            break;
            case 4: c.metodo4();
            break;
            case 5: System.out.println("Adios");
            default: System.out.println("Error");
        }
     }
        while(opc!=5);
        
       
    }
     }

