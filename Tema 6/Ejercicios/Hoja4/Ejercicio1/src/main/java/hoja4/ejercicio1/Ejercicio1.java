/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja4.ejercicio1;

/**
 *
 * @author Ginés
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        Equipo miequipo=new Equipo();
        

            Jugador j1= new Jugador("jug1",1.94F);
            miequipo.add(j1);
                
        
        
        Jugador j2= new Jugador("jug2",1.95F);
            miequipo.add(j2);
        
        System.out.println(miequipo.mostrarTodos());
        System.out.println(miequipo.masAlto());
       
        
        
    }
}
