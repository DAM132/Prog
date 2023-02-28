/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos.ejemplogenerico2;

/**
 *
 * @author Nuria
 * @param <T>
 */
/*El tipo T representa el tipo de datos que se va a usar en la clase en función de su 
declaración concreta*/
public class Contenedor<T> {
    private T objeto; //se inicializa a null, contenedor vacio

    public Contenedor() {
    }
    
    public void guardar(T nuevo){
        objeto=nuevo;
    }
    
    public T extraer(){
        T res=objeto;
        objeto=null;
        return res;
    }
}
