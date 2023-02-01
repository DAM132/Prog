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
public class Libro extends Publicacion {

 private int numPaginas;

    public Libro(int numPaginas, String titulo, String autor, int dia, int mes, int anno) {
        super(titulo, autor, dia, mes, anno);
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
     DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "titulo: " + this.titulo+ "autor " + this.getAutor()+ " fecha" + this.fecha.format(f)+ "nº paginas" + this.numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

 
    
 
    
}
