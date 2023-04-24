/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicio6;

import java.io.Serializable;

/**
 *
 * @author DAM132
 */
public class Factura implements Serializable {
    private int nfac;
    private double importe;
    private boolean pagado;
    private String nombre;

    public Factura(int nfac, double importe, boolean pagado, String nombre) {
        this.nfac = nfac;
        this.importe = importe;
        this.pagado = pagado;
        this.nombre = nombre;
    }

    public Factura() {
        nombre=Teclado.EsTexto("Dime nombre del cliente");
        importe=Teclado.Esdouble("Dime importe");
        pagado=Teclado.EsBoolean("Dime si esta pagada o no");
        nfac=Teclado.esEntero("Dime un numero de factura");
    }
    
    

    public int getNfac() {
        return nfac;
    }

    public void setNfac(int nfac) {
        this.nfac = nfac;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Factura{" + "nfac=" + nfac + ", importe=" + importe + ", pagado=" + pagado + ", nombre=" + nombre + '}';
    }
    
    
    
}
