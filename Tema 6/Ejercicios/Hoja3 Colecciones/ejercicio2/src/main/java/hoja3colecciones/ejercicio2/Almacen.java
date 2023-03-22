/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3colecciones.ejercicio2;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author DAM103
 */
public class Almacen {
    private Set<Articulo> almacen; 

    public Almacen() {
        this.almacen = new HashSet<>();
    }
    
    public void añadir(Articulo a){
        if(almacen.add(a)){
            System.out.println("articulo insertado");   
        }else{
            System.out.println("articulo no insertado");
        }
    }
    public Articulo buscar(String codigo){
        Articulo a=null;
        for (Articulo articulo : almacen) {
            if(articulo.getCodigo().equalsIgnoreCase(codigo))
                a=articulo;
        }
        return a;
    }
    public String pedidos(){
        String cadena="";
        for (Articulo articulo : almacen) {
            if(articulo.getExistencias()<5){
                cadena+=articulo.toString()+"\n";
            }
        }
        return cadena;
    }
}
