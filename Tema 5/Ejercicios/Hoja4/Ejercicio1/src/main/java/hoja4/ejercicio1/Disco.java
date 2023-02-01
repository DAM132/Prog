/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio1;

import java.time.format.DateTimeFormatter;

/**
 *
 * @author Ginés
 */
public class Disco extends Publicacion {
    private int duracionMinutos;

    public Disco(int duracionMinutos, String titulo, String autor, int dia, int mes, int anno) {
        super(titulo, autor, dia, mes, anno);
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
             DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");

         return "titulo: " + this.titulo+ "autor " + this.getAutor()+ " fecha -" + this.fecha.format(f)+ "duracion" + this.duracionMinutos;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }
    
}
