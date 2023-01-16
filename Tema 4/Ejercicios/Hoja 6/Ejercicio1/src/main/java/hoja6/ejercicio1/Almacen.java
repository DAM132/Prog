/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

/**
 *
 * @author Ginés
 */
public class Almacen {
    private Articulo [] art;

    public Almacen(int num) {
        art= new Articulo[num];
    }
    
    public void llenar(){
        for (int i = 0; i < art.length; i++) {
            art[i]= new Articulo();
            
        }
    }
    
    public void pedidos(){
        for (int i = 0; i < art.length; i++) {
            
            if(art[i].getExistencias()<10)
                System.out.println(art[i].getCodigo()+"le quedan existencias"+art[i].getExistencias());
        }
    }
    
}
