/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2colecciones.ejercicio2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author DAM103
 */
public class FichaVehiculo {
    private LocalDateTime fechaEntrada,fechaReparacion,fechaSalida;
    private String modelo,matricula;

    public FichaVehiculo() {
        this.modelo = Teclado.IntroString("Introduce modelo del coche");
        this.matricula = Teclado.IntroMatricula("Introduce la matricula");
        fechaEntrada=null;
        fechaReparacion=null;
        fechaSalida=null;
    }

    public FichaVehiculo(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        fechaEntrada=null;
        fechaReparacion=null;
        fechaSalida=null;
    }

    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDateTime fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDateTime getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(LocalDateTime fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyy hh:mm:ss");
        String cadena="Matricula: "+matricula+" modelo: "+ modelo + " fechaEntrada=" + fechaEntrada.format(dtf);
        if(fechaReparacion!=null){
            cadena=cadena+" fechaReparacion=" + fechaReparacion.format(dtf);
            if(fechaSalida!=null){
                cadena+=" fechaSalida=" + fechaSalida.format(dtf);
            }
        }
        return cadena;
    }
       
}
