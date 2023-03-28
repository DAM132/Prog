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
public abstract class  CuentaBancaria implements Identificable {
    protected Persona titular;
    protected double saldo;
    private String entidad;
    private String oficina;
    private String cuenta;

    public CuentaBancaria(Persona titular, String ccc) {
        this.titular = titular;
        this.saldo=0;
        this.entidad = ccc.substring(0,4);
        this.oficina = ccc.substring(4,8);
        this.cuenta = ccc.substring(10, 20);
    }
    
    

    @Override
    public HashMap<String, String> listaObjeto() {
         HashMap<String, String> aux;
         aux = new HashMap();
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
         aux.putAll(titular.listaObjeto());
         aux.put("Entidad", entidad);
         aux.put("Oficina", oficina);
         aux.put("cuenta", cuenta);
         aux.put("saldo", String.format("%,.2f", saldo));
         
        return aux;
    }
    
    
    public abstract void ingresar(double cantidad);
    
    public abstract void retirar(double cantidad);

    
    
    
    
    
    
}
