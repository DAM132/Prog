/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio2;

/**
 *
 * @author Ginés
 */
public class Ejecutable {
        public static void main(String[] args) {
            Articulo art= new Articulo();
            if(art instanceof Perecedero){
                System.out.println("art1 es instancia de perecedero");
            }
            
            Perecedero per= new Perecedero();
            
            //per=(Perecedero)art; // da error de ejecución puesto que art realmente no es perecedero
            
            //per=art; asi de error
            
            art=per;  //puede hacerse puesto que art es un perecedero gracias a la instruccion anterior
            
            
            per=(Perecedero)art;
            
            
            if (art instanceof Articulo)
                System.out.println("art es instancia de Articulo");
            if(art instanceof Perecedero)
                System.out.println("art es instancia de Perecedero");
            
            
        }
}
