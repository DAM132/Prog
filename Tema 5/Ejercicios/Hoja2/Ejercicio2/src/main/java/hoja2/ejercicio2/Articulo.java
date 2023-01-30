/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Articulo {
    protected int cod,precio;
    protected String desc;

    public Articulo() {
    
    }

    public Articulo(int cod, int precio, String desc) {
        this.cod = cod;
        this.precio = precio;
        this.desc = desc;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Articulo{" + "cod=" + cod + ", precio=" + precio + ", desc=" + desc + '}';
    }
    
    
    
}
