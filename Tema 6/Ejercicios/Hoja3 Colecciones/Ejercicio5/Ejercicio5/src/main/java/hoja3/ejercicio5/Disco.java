/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio5;

import java.time.DateTimeException;

/**
 *
 * @author Ginés
 */
public class Disco  extends Publicacion{
    
    private int duracionMinutos;

    public Disco(int duracionMinutos, String titulo, String autor, int d, int m, int y) throws DateTimeException, Exception {
        super(titulo, autor, d, m, y);
        this.duracionMinutos = duracionMinutos;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        return "Disco{"+super.toString() + "duracionMinutos=" + duracionMinutos + '}';
    }

}
