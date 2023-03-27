/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio1;

/**
 *
 * @author Ginés
 */
import java.util.HashMap;

public class Serie {
    private String nombre;
    private Tematica tematica;
    private String nacionalidad;
    private boolean finalizada;
    private int temporadas;
    private HashMap<String, Capitulo> capitulos;

    public Serie(String nombre, Tematica tematica, String nacionalidad, boolean finalizada, int temporadas) {
        this.nombre = nombre;
        this.tematica = tematica;
        this.nacionalidad = nacionalidad;
        this.finalizada = finalizada;
        this.temporadas = temporadas;
        this.capitulos = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tematica getTematica() {
        return tematica;
    }

    public void setTematica(Tematica tematica) {
        this.tematica = tematica;
      
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public HashMap<String, Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(HashMap<String, Capitulo> capitulos) {
        this.capitulos = capitulos;
    }

    @Override
    public String toString() {
        char f= (finalizada)?'s':'n'; 
        
        
        return "Nombre: " + nombre + ", Tematica: " + tematica + ", Nacionalidad: " + nacionalidad
                + ", Finalizada: " + f + ", Temporadas: " + temporadas;
    }

    public static String generaClaveCapitulo(String nombre, int temporada, int capitulo) {
        String clave = nombre.substring(0, 4).toUpperCase();
        if (temporada < 10) {
            clave += "0";
        }
        clave += temporada + "X";
        if (capitulo < 10) {
            clave += "0";
        }
        clave += capitulo;
        return clave;
    }

    public void insertaCapitulo(String clave, Capitulo capitulo) {
        if (capitulos.containsKey(clave)) {
            System.out.println("El capitulo " + clave + " ya existe.");
        } else {
            capitulos.put(clave, capitulo);
        }
    }

    public void eliminaCapitulo(String clave) {
        if (capitulos.containsKey(clave)) {
            capitulos.remove(clave);
        } else {
            System.out.println("El capitulo " + clave + " no existe.");
        }
    }

    public void visualizaCapitulos() {
        for (Capitulo capitulo : capitulos.values()) {
            System.out.println(capitulo.toString());
        }
    }
}


