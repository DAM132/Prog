/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja8.ejercicio3;

/**
 *
 * @author gines
 */

enum TipoEstado
{
    HABILITADA, BLOQUEADA
}
public class Tarjeta {
    
    private String nombret,ncc,pin;
    private double saldo;
    private TipoEstado estado;

    public Tarjeta(String nombret, String ncc, double saldo) {
        this.nombret = nombret;
        this.ncc = ncc;
        this.saldo = saldo;
        pin="1234";
        estado e=estado.bloqueada;
    }

    public String getNombret() {
        return nombret;
    }

    public String getNcc() {
        return ncc;
    }

    public String getPin() {
        return pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombret(String nombret) {
        this.nombret = nombret;
    }

    public void setNcc(String ncc) {
        this.ncc = ncc;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
public void desbloquea(pin){
    if(pin==this.pin)
}
    
}
