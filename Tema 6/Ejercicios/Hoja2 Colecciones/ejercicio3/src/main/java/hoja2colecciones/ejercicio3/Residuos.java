/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2colecciones.ejercicio3;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;

/**
 *
 * @author DAM103
 */
public class Residuos {
    private LinkedList<Contenedor> contenedores;

    public Residuos() {
        this.contenedores = new LinkedList<>();
    }
    //Funcionamiento como pila
    public String listar(){
        String cadena= "";
        if(!contenedores.isEmpty()){
            for (Contenedor c : contenedores) {
                cadena+=c.toString()+"\n";
            }
        }else{
            cadena="no hay contenedores";
        }
        return cadena;
    }
    public Contenedor almacenar(Contenedor c){
        contenedores.addLast(c);
        return contenedores.getLast();
    }
    public String retirar(){
        String cadena="";
        if(!contenedores.isEmpty()){
            Contenedor contenedor=contenedores.removeLast();
            cadena+=contenedor.toString();
            long difSegundos=ChronoUnit.SECONDS.between(contenedor.getFecha(), 
                    LocalDateTime.now());
            cadena+= "\t" + difSegundos+" segundos";
        }
        return cadena;
    }

}
