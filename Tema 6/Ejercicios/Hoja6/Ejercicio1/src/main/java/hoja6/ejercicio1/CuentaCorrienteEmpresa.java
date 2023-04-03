/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

import java.util.LinkedHashMap;

/**
 *
 * @author Ginés
 */
public class CuentaCorrienteEmpresa extends CuentaCorriente {
    private double maximoDescubierto;
    
   public static final double  MAX_DESCUBIERTO = 50000;

    public CuentaCorrienteEmpresa(double maximoDescubierto,Persona titular, String ccc) {
        super(titular, ccc);
        this.maximoDescubierto = maximoDescubierto;
    }

   
    

    public double getMaximoDescubierto() {
        return maximoDescubierto;
    }

    public void setMaximoDescubierto(double maximoDescubierto) {
        this.maximoDescubierto = maximoDescubierto;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

      @Override
    public void ingresar(double cantidad) {
            if(cantidad>0){
                super.saldo+=cantidad;
            }
            else{
                System.out.println("Cantidad no valida");
            }
    }

    @Override
    public void retirar(double cantidad) {
            if(cantidad>saldo||cantidad<0)
                System.out.println("Cantidad mayor a saldo");
            else
                saldo-=cantidad;
    }
    
           public LinkedHashMap<String, String> listaObjeto() {
         LinkedHashMap<String, String> aux;
         aux = new LinkedHashMap();
           aux.putAll(super.listaObjeto());
         aux.put("\nTipo de cuenta ", "\nCuenta Corriente Empresa ");
       
         aux.put("\nMaximo Descubierto ", String.valueOf(maximoDescubierto));
         
        return aux;
    }
   
   
}
