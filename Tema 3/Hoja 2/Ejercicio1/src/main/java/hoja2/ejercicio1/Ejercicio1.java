/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja2.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Ejercicio1 {

    public static void main(String[] args) {
Scanner in= new Scanner(System.in);
        System.out.println("Dime el dia de la semana del 1 al 7");
int diadesemana=in.nextInt();

switch (diadesemana)
{
     case 1:
           System.out.println("lunes");
     break; 
     case 2:
          System.out.println("martes");
     break; 
     case 3:
           System.out.println("miercoles"); 
     break; 
     case 4:
           System.out.println("jueves");
     break; 
     case 5:
         System.out.println("viernes");    
         break; 
    case 6:
        System.out.println("sabado");    
        break; 
  
    default: 
        System.out.println("numero no introducido");
}
    }
}
