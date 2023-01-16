/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Ejercicio2 {

    public static void main(String[] args) {
Scanner in= new Scanner(System.in);
        System.out.println("Dime el dia");
int diadesemana=in.nextInt();

switch (diadesemana)

{
     case 1,8,16,22,29:
           System.out.println("lunes");
     break; 
     case 2,9,17,23,30:
          System.out.println("martes");
     break; 
     case 3,10,18,24,31:
           System.out.println("miercoles"); 
     break; 
     case 4,11,19,25:
           System.out.println("jueves");
     break; 
     case 5,12,20,26:
         System.out.println("viernes");    
         break; 
    case 6,13,21,27:
        System.out.println("sabado");    
        break; 
  
    default: 
        System.out.println("numero mayor a 30");    
}    }
}
