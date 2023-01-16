/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package grupo2.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        double radiocilindro,alturacilindro;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Dime el radio del cilindro ");
        radiocilindro=teclado.nextDouble();
        System.out.println("Dime la altura del cilindro ");
        alturacilindro=teclado.nextDouble();
        
        System.out.println("El area lateral es "+2*Math.PI*radiocilindro*alturacilindro);
        System.out.println("El volumen es " + Math.PI*alturacilindro*Math.pow(radiocilindro, 2));
        
        

    }
}
