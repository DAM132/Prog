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
public class Perecedero extends Articulo {
    private int mes,ano,caducidad;

    public Perecedero() {
        super();
        Scanner in= new Scanner(System.in);
        System.out.println("Dime el mes");
        mes=in.nextInt();
        System.out.println("Dime el año");
        ano=in.nextInt();
        System.out.println("Dime la caducidad");
        caducidad=in.nextInt();
        
    }
    
    
}
