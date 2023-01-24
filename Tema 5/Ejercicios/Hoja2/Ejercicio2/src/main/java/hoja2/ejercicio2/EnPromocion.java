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
        Scanner in = new Scanner(System.in);
        System.out.println("Dime el descuento");
        des=in.nextInt();
    }
    
    
}
