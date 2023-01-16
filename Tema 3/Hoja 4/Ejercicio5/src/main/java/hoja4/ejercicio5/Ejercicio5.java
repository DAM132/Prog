/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja4.ejercicio5;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Ejercicio5 {

    public static void main(String[] args) {
Random rand = new Random();
Scanner in= new Scanner(System.in);
int ale;
ale=rand.nextInt(1000);
System.out.printf("%04d%n",ale);
        for (int i = 1; i<5&&ale!=in.nextInt(); i++) {
            if(ale==in.nextInt()){
                System.out.println("Acertaste!!");
                
            }
            else{
            System.out.println("lo siento no es la combinacion");
                System.out.println("intento"+i);
            }
            
        }
    }
}
