/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja4.ejercicio6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Random r1 = new Random();
        int apuesta;
        char contestacion='s';
         int ale;
        for(;contestacion=='s';){
        
        System.out.println("Cuando quieres apostar?");
        apuesta=in.nextInt();
        ale=r1.nextInt(2)+1;
         if(ale==1){
            apuesta=apuesta*2;
            System.out.println("Has ganado" + apuesta);
            System.out.println("¿quiere seguir jugando?");
            contestacion=in.next().charAt(0);
        }
        
            System.out.println("has perdido todo");
            apuesta=0;
            System.out.println("¿quiere seguir jugando?");
            contestacion=in.next().charAt(0);
        }
        }
    
        
    
    }

