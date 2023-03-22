/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2colecciones.ejercicio4;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author DAM103
 */
public class Servicio {
    private Queue<Cliente> enEspera;
    private LinkedList<Cliente> atendidos;

    public Servicio() {
        this.enEspera = new LinkedList<>();
        this.atendidos = new LinkedList<>();
    }
    
    public void añadirCliente(Cliente c){
        enEspera.add(c);
    }
    
    public boolean atenderCliente(){
        boolean atendido=false;
        Cliente c=enEspera.poll();
        if(c!=null){
            c.setFechaAtencion(LocalDateTime.now());
            atendidos.add(c);
            atendido=true;
        }
        return atendido;
    }
    public double tiempoMedioEnEspera(){
        double segundos=0;
        for (Cliente cliente : enEspera) {
            segundos+=ChronoUnit.SECONDS.between(cliente.getFechaLlegada(), LocalDateTime.now());
        }
        return segundos/enEspera.size();
    }
    public double tiempoMedioAtendidos(){
        double segundos=0;
        for (Cliente cliente : atendidos) {
            segundos+=ChronoUnit.SECONDS.between(cliente.getFechaLlegada(), cliente.getFechaAtencion());
        }
        return segundos/atendidos.size();
    }
    public String mostrarEstado(){
        String cadena="EN ESPERA\n";
        for (Cliente c : enEspera) {
            cadena+=c.toString()+"\n";
        }
        cadena+="ATENDIDOS\n";
        for (Cliente c : atendidos) {
            cadena+=c.toString()+"\n";
        }
        return cadena;
    }
}
