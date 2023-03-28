/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

import java.util.HashMap;

/**
 *
 * @author Ginés
 */
public class CuentaCorrientePersonal extends CuentaBancaria {

    private double ComisionMantenimiento;
    public static final double MIN_COMISION_MANTENIMIENTO = 0;
    public static final double MAX_COMISION_MANTENIMIENTO = 0;

    public CuentaCorrientePersonal(double ComisionMantenimiento, Persona titular, String ccc) {
        super(titular, ccc);
        this.ComisionMantenimiento = ComisionMantenimiento;
    }

    public double getComisionMantenimiento() {
        return ComisionMantenimiento;
    }

    public void setComisionMantenimiento(double ComisionMantenimiento) {
        this.ComisionMantenimiento = ComisionMantenimiento;
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
    
           public HashMap<String, String> listaObjeto() {
         HashMap<String, String> aux;
         aux = new HashMap();
         aux.put("Tipo de cuenta", "Cuenta Corriente Persona");
         aux.putAll(super.listaObjeto());
         aux.put("ComisionMantenimiento", String.valueOf(ComisionMantenimiento));
         
        return aux;
    }
}
