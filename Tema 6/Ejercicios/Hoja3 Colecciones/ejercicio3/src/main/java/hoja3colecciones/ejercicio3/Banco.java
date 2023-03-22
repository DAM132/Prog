/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3colecciones.ejercicio3;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author DAM103
 */
public class Banco {
    private Set<Cliente> banco;

    public Banco() {
        this.banco = new LinkedHashSet<>();
    }
    
    public void insertar(Cliente c){
        if(banco.add(c)){
            System.out.println("articulo insertado");   
        }else{
            System.out.println("articulo no insertado");
        }
    }
    public Cliente buscar(String codigo){
        Cliente c=null;
        for (Cliente cliente : banco) {
            if(cliente.getCodigo().equalsIgnoreCase(codigo))
                c=cliente;
        }
        return c;
    }
    public void eliminar(String codigo){
        Iterator<Cliente> it=banco.iterator();
        while(it.hasNext() ){
            if(it.next().getCodigo().equals(codigo)){
                it.remove();
            }
        }
    }
    public Cliente SalarioMayor(){
        Cliente c=null;
        return c;
    }
}
