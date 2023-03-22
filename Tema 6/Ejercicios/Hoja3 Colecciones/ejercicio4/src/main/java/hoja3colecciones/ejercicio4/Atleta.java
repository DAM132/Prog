/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3colecciones.ejercicio4;

/**
 *
 * @author DAM103
 */
public class Atleta {
    private int dorsal;
    private String nombre;
    private double tiempo;

    public Atleta() {
        this.dorsal = Teclado.IntroEntero("Introduce el dorsal");
        this.nombre = Teclado.IntroStringSinNumeros("Introduce el nombre");
        this.tiempo = Teclado.IntroDouble("Introduce el tiempo");
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Atleta{" + "dorsal=" + dorsal + ", nombre=" + nombre + ", tiempo=" + tiempo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.dorsal;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Atleta other = (Atleta) obj;
        return this.dorsal == other.dorsal;
    }
    
    
    
}
