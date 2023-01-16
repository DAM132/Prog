/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejemplos.ejemplo1;

import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Ejemplo1 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        //generamos el array tipo doubl y con nombre notas
        double[] notas;
        // creamos el objeto y le asignamos 30 huecos tamaño
        notas = new double[3];
        // asignamos un valor a 0 por ejemplo
        notas[0] = 3.2;
        // al ser double el string no se podria guardar
        //notas[1]="hola!";
        // error de ejecución tenemos tamaño 30 no 35
        //notas[35]=10;

        //genera ya el objeto con sus 4 huecos
        double[] notas2 = {3.0, 5.2, 8, 0.5};

        System.out.println(notas2);
        System.out.println("Tamaño de notas:" + notas2.length);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce el elemento" + (i+1)+".");
            notas[i]=in.nextDouble();
            

        }
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce el elemento" + (i+1)+":"+notas[i]);
        }
    
    }
}
