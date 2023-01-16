/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio5;

/**
 *
 * @author gines
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        double precio=62.5;
        final double IVA=0.16;
        final double DESCUENTO=0.1;
        double precio_iva=precio+precio*IVA;
        double precio_dto=precio_iva*DESCUENTO+precio;
        System.out.println("Precio sin iva"+precio);
        System.out.println("Precio con iva"+precio_iva);
        System.out.println("Precio con DTO"+precio_dto);
    }
}
