/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio5;

import java.time.DateTimeException;
import java.time.LocalDate;

/**
 *
 * @author Ginés
 */
public final class Libro extends Publicacion {
    private int numPag;

    public Libro(int numPag, String titulo, String autor, int d, int m, int y) throws DateTimeException, Exception {
        super(titulo, autor, d, m, y);
        this.numPag = numPag;
    }

    

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Libro{"+super.toString() + "numPag=" + numPag + '}';
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
}
