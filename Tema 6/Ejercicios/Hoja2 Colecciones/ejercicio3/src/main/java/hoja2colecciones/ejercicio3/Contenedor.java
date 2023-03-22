/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2colecciones.ejercicio3;

import java.time.LocalDateTime;

/**
 *
 * @author DAM103
 */
public class Contenedor {
    private String codigo, origen;
    private LocalDateTime fecha;

    public Contenedor() {
        this.codigo = Teclado.IntroCodigo("Introduce el codigo");
        this.origen = Teclado.IntroOrigen("Introduce el origen del contenedor");
        this.fecha = Teclado.IntroFechaHora("Introduce la fecha");
    }

    public Contenedor(String codigo, String origen, LocalDateTime fecha) {
        this.codigo = codigo;
        this.origen = origen;
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        //Formatear fecha
        return "Contenedor{" + "codigo=" + codigo + ", origen=" + origen + ", fecha=" + fecha + '}';
    }  
}
