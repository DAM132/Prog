/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

import java.util.Random;

/**
 *
 * @author gines
 */
public class tarjeta {
     Random r1 = new Random();

  
    public enum estado{
        HABILITADO, DESACTIVADO
    }
    private String nombre,numerocuenta;
    private int pin;
    private double saldo;
    private estado tarj;

    public tarjeta(String nombre, String numerocuenta, double saldo) {
        this.nombre = nombre;
        this.numerocuenta = numerocuenta;
        this.saldo = saldo;
        pin=r1.nextInt(9999);
        this.tarj=estado.DESACTIVADO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
    public void desbloquea(int ipin){
        if(ipin==pin){
            this.tarj=estado.HABILITADO;
        }
        else{
            System.out.println("pin incorrecto");
            
        }
    }
  
    public void pagar(int importe,int pin,String desc,boolean propina){
        if(tarj==estado.HABILITADO){
            if(this.pin==pin){
                if(saldo>importe){
                    if(propina==true){
                        saldo=-importe+(0.05*importe);
                        this.imprimirticket(desc, importe, propina);                       
                    }
                    else{
                        saldo=-importe;
                    this.imprimirticket(desc, importe, propina);                 
                    }
                }
                else{
                    System.out.println("no tienes dinero");
                }
            }
            else{
                System.out.println("pin incorrecto");
            }
        }
        else{
            System.out.println("Esta bloqueada");
        }
        
    }
       public void imprimirticket(String desc, double importe, boolean propina){
           System.out.println("Numero de titular: " +nombre);
           
         
    }
   

}
