/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Ginés
 */
public class FichaVehiculo {
    private LocalDateTime fentrada,freparacion,fsalida=null;
    private String modelo,matricula;

    public FichaVehiculo() {
        
    }

    public FichaVehiculo(String modelo, String matricula) {
        
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public LocalDateTime getFentrada() {
        return fentrada;
    }

    public void setFentrada(LocalDateTime fentrada) {
        this.fentrada = fentrada;
    }

    public LocalDateTime getFreparacion() {
        return freparacion;
    }

    public void setFreparacion(LocalDateTime freparacion) {
        this.freparacion = freparacion;
    }

    public LocalDateTime getFsalida() {
        return fsalida;
    }

    public void setFsalida(LocalDateTime fsalida) {
        this.fsalida = fsalida;
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
        
        
        DateTimeFormatter formateo= DateTimeFormatter.ofPattern("dd-MM-yyyy kk:mm:ss");
        
        String Cadena="\n"+  "FichaVehiculo{" + ", modelo=" + modelo + ", matricula=" + matricula + '}'+ "fentrada=" + fentrada.format(formateo);
        
        if(freparacion!=null )
        {
            Cadena+= ", freparacion=" + freparacion.format(formateo); 
        if(fsalida!=null){
            Cadena+=", fsalida=" + fsalida.format(formateo);
        }
        }
        
        
                
               
                
                
        
        return Cadena;
    }

    
    
}
