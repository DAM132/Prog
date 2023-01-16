/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Veterinario {

    private Mascota[] m;
    private int cont;

    public Veterinario() {
        m = new Mascota[2];
        cont = 0;
    }

    public void añadir() {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime el nombre");
        String n = in.nextLine();
        System.out.println("Dime el día nac");
        int d = in.nextInt();
        System.out.println("Dime el mes de nac");
        int mont = in.nextInt();
        System.out.println("Dime el año de nac");
        int y = in.nextInt();
        m[cont] = new Mascota(n, y, mont, d);
        cont++;

    }

    public String mostrar() {
        String cadena = "";
        for (int i = 0; i < cont; i++) {
            cadena += m[i].toString();
        }

        return cadena;
    }

    public String mostrarMayores() {
        String cadena = "";
        for (int i = 0; i < cont; i++) {
            if (m[i].getedad() > 5) {
                cadena += m[i].toString();
            }

        }

        return cadena;

    }
}


