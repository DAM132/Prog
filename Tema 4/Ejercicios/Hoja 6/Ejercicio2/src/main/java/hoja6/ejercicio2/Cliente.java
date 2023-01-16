/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Cliente {
    private int codigo;
    private String nombre,apellidos,telefono;
    private double saldo;

   

    public Cliente() {
        Scanner in=new Scanner(System.in);
        System.out.println("Dime un nombre");
        nombre=in.next();
        System.out.println("Dime apellidos");
        apellidos=in.next();
        System.out.println("Telefono");
        telefono=in.next();
        System.out.println("Saldo");
        saldo=in.nextDouble();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", saldo=" + saldo + '}';
    }

  
    
}
