/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio5;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Ginés
 */
public abstract class Publicacion {
    protected String titulo;
     protected String autor;
     protected LocalDate fecha;

    public Publicacion(String titulo, String autor,int d,int m,int y) throws DateTimeException,Exception {
        if(d<0||d>31)
            throw new Exception("Fecha incorrecta revisa el día");
        if(m<0||m>12)
            throw new Exception("Fecha incorrecta revisa el mes");
         this.fecha=LocalDate.of(y, m, d);
        this.titulo = titulo;
        this.autor = autor;
       
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
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.titulo);
        hash = 73 * hash + Objects.hashCode(this.autor);
        return hash;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "titulo=" + titulo + ", autor=" + autor + ", fecha=" + fecha + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Publicacion other = (Publicacion) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }
     
    
     
}
