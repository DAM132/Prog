/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja2.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Gines
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radio;

        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(10);

        System.out.println("Radio: ");
        radio = in.nextDouble();
        Circulo c3 = new Circulo(radio);

        c1.setRadio(5);
        System.out.println("Radio de C1 " + c1.getRadio());
        System.out.println("Radio de C3 " + c3.getRadio());
        System.out.println("Area de C2 " + c2.area());
        System.out.println("Area de C3 " + c3.area());
        System.out.println("Longuitud de C3 " + c3.longitud());



    }
}
