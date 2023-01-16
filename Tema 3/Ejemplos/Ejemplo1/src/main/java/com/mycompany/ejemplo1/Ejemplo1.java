/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejemplo1;

/**
 *
 * @author gines
 */
public class Ejemplo1 {

    public static void main(String[] args) {
        int nota = 8;
        if (nota < 5) //al no tener llaves solo ejecuta la primera instrucion en la condición despues pasa a la segunda línea
        {
            System.out.println("suspenso");
        }
        System.out.println("estudia mas");
        int x = 5;
        if (x == 1) {
            System.out.println("x vale 1");
        } else if (x == 2) {
            System.out.println("x vale 2");
        } else if (x == 3) {
            System.out.println("x vale 3");
        } else{
            System.out.println("X vale todo menos 1,2,3");
        }
    }
}
