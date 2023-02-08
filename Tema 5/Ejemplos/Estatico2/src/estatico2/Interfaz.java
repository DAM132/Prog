/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatico2;

/**
 *
 * @author Nuria
 */
public interface Interfaz {
    
    public void metodo();
    
    default public void metodoPorDefecto(){
        System.out.println("Es un método por defecto");
    }
    
    public static void metodoEstatico(){
        System.out.println("Es un método estático");
    }
}
