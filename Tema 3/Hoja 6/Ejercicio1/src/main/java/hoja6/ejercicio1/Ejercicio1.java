/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja6.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
tarjeta t= new tarjeta("gines","22222",2000);
        System.out.println(t.getPin());
        Scanner in= new Scanner(System.in);
        int pin = in.nextInt();
        t.desbloquea(pin);
t.pagar(20, pin, "compra", false);



        }
}
