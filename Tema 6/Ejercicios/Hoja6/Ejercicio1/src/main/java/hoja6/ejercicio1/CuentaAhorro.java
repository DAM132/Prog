/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

import java.time.format.DateTimeFormatter;
import java.util.HashMap;

/**
 *
 * @author Ginés
 */
public  class CuentaAhorro extends CuentaBancaria{
    
   private double tipoInteres;

    public CuentaAhorro(double tipoInteres, Persona titular, String ccc) {
        super(titular, ccc);
        this.tipoInteres = tipoInteres;
    }

    public static final double MIN_TIPO_INTERES = 0.50;
    public static final double MAX_TIPO_INTERES = 8.50;

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
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

    
       public HashMap<String, String> listaObjeto() {
         HashMap<String, String> aux;
         aux = new HashMap();
         aux.put("Tipo de cuenta", "Cuenta de ahorro");
         aux.putAll(super.listaObjeto());
         aux.put("Tipo interes", String.valueOf(tipoInteres));
         
        return aux;
    }
  
}
