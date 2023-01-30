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
public class EnPromocion extends Articulo {
    private int des;

    public EnPromocion() {
       super();
    
    }

    public EnPromocion(int des, int cod, int precio, String desc) {
        super(cod, precio, desc);
        this.des = des;
    }

    public int getDes() {
        return des;
    }

 

    @Override
    public String toString() {
        return super.toString()+ "EnPromocion{" + "des=" + des + '}';
    }
    
}
