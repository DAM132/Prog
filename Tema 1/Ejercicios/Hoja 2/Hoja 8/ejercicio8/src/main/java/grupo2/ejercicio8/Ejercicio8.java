/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package grupo2.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Ejercicio8 {

    public static void main(String[] args) {
 double radiocir;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Dime el radio del circulo ");
        radiocir=teclado.nextDouble();
        System.out.println("Area; " +Math.pow(radiocir, 2)*Math.PI); 
        System.out.println("Longitud" + 2*Math.PI*radiocir);}
}
