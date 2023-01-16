/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Articulo {
    private int codigo;
    private String desc;
    private int existencias;

    public Articulo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime el codigo");
        this.codigo = in.nextInt();
        System.out.println("Dime desc");
        this.desc = in.next();
        System.out.println("Dime existencias");
        this.existencias = in.nextInt();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDesc() {
        return desc;
    }

    public int getExistencias() {
        return existencias;
    }
    
    
}
