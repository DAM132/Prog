/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ginés
 */
public class Asociacion {
    
    private List<Persona> listaAsoc;
    
    public Asociacion(){
        listaAsoc= new ArrayList<>();
    }

    public List<Persona> getListaAsoc() {
        return listaAsoc;
    }

    public void setListaAsoc(List<Persona> listaAsoc) {
        this.listaAsoc = listaAsoc;
    }
    
    
    
}
