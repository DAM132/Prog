/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2colecciones.ejercicio1;

/**
 *
 * @author DAM103
 */
public class Curso {
    private String codigo,descripcion;
    private int nHoras;

    public Curso() {
        this.codigo = Teclado.IntroString("Introduce el codigo del curso");
        this.descripcion = Teclado.IntroString("Introduce descripcion");
        this.nHoras = Teclado.IntroEntero("Numero de horas");
    }

    public Curso(String codigo, String descripcion, int nHoras) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.nHoras = nHoras;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getnHoras() {
        return nHoras;
    }

    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", nHoras=" + nHoras + '}';
    }
    
}
