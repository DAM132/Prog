/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

/**
 *
 * @author Ginés
 */
public abstract class Publicacion {
    protected String titulo, autor;
    protected LocalDate fecha;

    public Publicacion(String titulo, String autor, int dia, int mes, int anno) {
        this.titulo = titulo;
        this.autor = autor;
        fecha=LocalDate.of(anno, mes, dia);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "titulo=" + titulo + ", autor=" + autor + ", fecha=" + fecha + '}';
    }
    
    
}
