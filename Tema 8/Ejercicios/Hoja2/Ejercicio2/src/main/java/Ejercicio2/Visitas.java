package Ejercicio2;

import java.sql.Date;
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAM132
 */
public class Visitas {
    
    private int id;
    private Pacientes paciente;
    private LocalDate fecha;
    private String tratamiento,observaciones;

    public Visitas(int id, Pacientes paciente, LocalDate fecha, String tratamiento, String observaciones) {
        this.id = id;
        this.paciente = paciente;
        this.fecha = fecha;
        this.tratamiento = tratamiento;
        this.observaciones = observaciones;
    }

    public Visitas() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Visitas{" + "id=" + id + ", paciente=" + paciente + ", fecha=" + fecha + ", tratamiento=" + tratamiento + ", observaciones=" + observaciones + '}';
    }
    
    
    
}
