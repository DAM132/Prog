/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio2;

import java.util.Random;

/**
 *
 * @author Ginés
 */
public class Sopa {

    private char[][] array;

    public Sopa() {

        array = new char[10][20];
        this.generaLetras();
    }

    public Sopa(int f, int c) {
        array = new char[f][c];
        this.generaLetras();

    }

    private void generaLetras() {
        Random r = new Random();
        String let = "abcdefghyjklmnopqrstuvwxyz";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = let.charAt(r.nextInt(let.length()));
            }
        }

    }

    public void mostrar() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);

            }
            System.out.println("");

        }
    }

    public void setPalabra(String palabra, int x, int y, int D) {
        int contador = 0;

        if (D == 1) {
            if ((palabra.length() + y) < array[x].length) {
                for (int i = 0; i < palabra.length(); i++) {

                    array[x][y++] = palabra.charAt(i);
                }
            }
        } else if (D == -1) {

            if ((palabra.length() + x) < array.length) {
                for (int i = 0; i < palabra.length(); i++, x++) {

                    array[x][y] = palabra.charAt(i);
                }
            }

        }

    }

    }
    
    

