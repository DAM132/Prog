/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.ejemplo3;

/**
 *
 * @author Gines
 */
public class Clase {
    private int x;
    private String nombre;
    
    public Clase(int x,String n){
        this.x=x;
        this.nombre=n;
    }

    public Clase() {
       
    }
    //entra importante!
    public Clase(Clase C){
        this.x=C.x;
    }
    
}
