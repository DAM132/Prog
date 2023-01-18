/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja10.ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Multiplicar m = new Multiplicar();
        m.mostrar();
        System.out.println("");
//rellena el 2º matriz        
        m.Multiplicar();
        //la muestro rellena
        m.mostrar();
        System.out.println(Arrays.toString(m.valoresAspa()));
        System.out.println(Arrays.toString(m.tablaMultiplicar(2)));
        
        // corrección de multiplicar
        
        int n;
        do{
            System.out.println("Introduce el numero de la tabla entre 1 y 9 ");
            n= in.nextInt();
        }
        while(n < 1||n>9);
        int [] multiplica=m.tablaMultiplicar(n);
        for (int i = 0; i < multiplica.length; i++) {
            System.out.print(multiplica[i]+", ");
            
        }
        System.out.print(multiplica[multiplica.length-1]);
    }

}
