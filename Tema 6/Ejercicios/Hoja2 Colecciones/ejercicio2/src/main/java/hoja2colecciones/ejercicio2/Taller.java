/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2colecciones.ejercicio2;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author DAM103
 */
public class Taller {
    private LinkedList<FichaVehiculo> enEspera;
    private LinkedList<FichaVehiculo> reparados;
    private LinkedList<FichaVehiculo> finalizados;

    public Taller() {
        this.enEspera = new LinkedList<>();
        this.reparados = new LinkedList<>();
        this.finalizados = new LinkedList<>();
    }
    
    public void insertarVehiculo(FichaVehiculo f){
        f.setFechaEntrada(LocalDateTime.now());
        enEspera.add(f);
    }
    
    public void repararVehiculo(String matricula){
        Iterator<FichaVehiculo> it=enEspera.iterator();
        boolean aux=false;
        while(it.hasNext()){
            FichaVehiculo f=it.next();
            if(f.getMatricula().equalsIgnoreCase(matricula)){
                f.setFechaReparacion(LocalDateTime.now());
                reparados.add(f);
                it.remove();
                aux=true;
            }
        }
        if(aux){
            System.out.println("Vehiculo reparado");
        }else{
            System.out.println("Vehiculo no encontrado");
        }
    }
    public void darSalidaVehiculo(String matricula){
        Iterator<FichaVehiculo> it=reparados.iterator();
        boolean aux=false;
        while(it.hasNext()){
            FichaVehiculo f=it.next();
            if(f.getMatricula().equalsIgnoreCase(matricula)){
                f.setFechaSalida(LocalDateTime.now());
                finalizados.add(f);
                it.remove();
                aux=true;
            }
        }
        if(aux){
            System.out.println("Vehiculo dado salida");
        }else{
            System.out.println("Vehiculo no encontrado");
        }
    }
    public String mostrarEstado(){
        String cadena="EN ESPERA\n";
        for (FichaVehiculo f : enEspera) {
            cadena+=f.toString()+"\n";
        }
        cadena+="REPARADOS\n";
        for (FichaVehiculo f : reparados) {
            cadena+=f.toString()+"\n";
        }
        cadena+="FINALIZADOS\n";
        for (FichaVehiculo f : finalizados) {
            cadena+=f.toString()+"\n";
        } 
        return cadena;
    }
}
