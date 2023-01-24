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
    Scanner in= new Scanner(System.in);
        System.out.println("Dime el cod");
        cod=in.nextInt();
        System.out.println("Dime el precio");
        precio=in.nextInt();
        System.out.println("Dime la descripción");
        desc=in.nextLine();
    }
    
}
