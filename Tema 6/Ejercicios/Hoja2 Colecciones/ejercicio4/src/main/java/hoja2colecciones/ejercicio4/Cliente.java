/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2colecciones.ejercicio4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author DAM103
 */
public class Cliente {
    private String nombre, telefono;
    private LocalDateTime fechaLlegada, fechaAtencion;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaLlegada=LocalDateTime.now();
        fechaAtencion=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDateTime getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalDateTime fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public LocalDateTime getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(LocalDateTime fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyy hh:mm:ss");
        String cadena="Cliente{" + "nombre=" + nombre + ", telefono=" + telefono + 
                ", fechaLlegada=" + fechaLlegada.format(dtf);
        if(fechaAtencion!=null){
            cadena+=", fechaAtencion=" + fechaAtencion.format(dtf) + '}';
        }
        return cadena;
    }
    
    
    
}
