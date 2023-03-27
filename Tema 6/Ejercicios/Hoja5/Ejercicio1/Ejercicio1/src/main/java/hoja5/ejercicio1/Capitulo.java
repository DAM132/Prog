/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio1;

/**
 *
 * @author Ginés
 */
public class Capitulo {
      private int numTemporada;
    private int numCapitulo;
    private String descripcion;
    
    public Capitulo(int numTemporada, int numCapitulo, String descripcion) {
        this.numTemporada = numTemporada;
        this.numCapitulo = numCapitulo;
        this.descripcion = descripcion;
    }
    
    public int getNumTemporada() {
        return numTemporada;
    }
    
    public void setNumTemporada(int numTemporada) {
        this.numTemporada = numTemporada;
    }
    
    public int getNumCapitulo() {
        return numCapitulo;
    }
    
    public void setNumCapitulo(int numCapitulo) {
        this.numCapitulo = numCapitulo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString() {
        return "Temporada " + numTemporada + ", Capítulo " + numCapitulo + ": " + descripcion;
    }
}
