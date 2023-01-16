/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja5.ejercicio1;

/**
 *
 * @author Gines
 */
public class Ejercicio1 {

    public static void main(String[] args) {
       Restaurante r=new Restaurante(1,1);
       
        System.out.println("platos: " +r.getNumPlatos());
        if (r.sirvePlato()){
            System.out.println("Plato servido");
        }else{
            System.out.println("Plato no servido");
        }
                System.out.println("platos: " +r.getNumPlatos());
    
                
               r.AddChorizo(2);
               r.AddHuevos(1);
               System.out.println("Huevos" + r.getHuevos());
               System.out.println("Chorizo" + r.getChorizo());

       
    }
}
