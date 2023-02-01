/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.ejemplo;

/**
 *
 * @author Nuria
 */
public class Hijo extends Padre{
    
    public void mostrar(){
        getNombre();
        this.getNombre();
        super.getNombre();
        System.out.println("Llame al padre y soy el hijo");
    }
}
