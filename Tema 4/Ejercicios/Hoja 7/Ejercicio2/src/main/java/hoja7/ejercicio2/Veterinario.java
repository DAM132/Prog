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
        m = new Mascota[300];
        cont = 0;
    }

    //modificación 
    public void añadir(Mascota mascota) {
        if(m.length>cont){
        m[cont] = mascota;
        cont++;}

    }

    public String mostrar() {
        String cadena = "";
        for (int i = 0; i < cont; i++) {
            cadena += m[i].toString() + " ";
        }

        return cadena;
    }

    public String mostrarMayores() {
        String cadena = "";
        for (int i = 0; i < cont; i++) {
            if (m[i].getedad() > 5) {
                cadena += m[i].toString() +" ";
            }

        }

        return cadena;

    }
}


