/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3colecciones.ejercicio1;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author DAM103
 */
public class Mundo {
    private Set<String> paises;

    public Mundo() {
        this.paises = new HashSet<>();
    }
    
    public void añadir(String nombre){
        if(paises.add(nombre.toUpperCase())){
            System.out.println("Insertado");
        }else{
            System.out.println("No insertado");
        }
    }
    public void eliminar(String nombre){
        if(paises.remove(nombre.toUpperCase())){
            System.out.println("Eliminado "+ nombre);
        }else{
            System.out.println("No eliminado "+ nombre);
        }
    }
    public String listar(){
        return paises.toString();
    }
}
