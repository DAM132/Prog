/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.ejemplo1interfaces;

/**
 *
 * @author Nuria
 */
public class Ejemplo1Interfaces {

    public static void main(String[] args) {
        Clase c=new Clase();
        c.hagoAlgo(55);
        c.hagoAlgoMas("Hola");
        c.imprime();
        c.mostrar();
        c.metodoDeClase();
        
        //defino una variable de Interface y guardo el objeto c en esa variable
        Interface1 inter=c;
        inter.imprime();
        
        //no se puede acceder al método de la clase desde la variable interfac
//        inter.metodoDeClase(); 
        //Solo me deja llamar a los métodos de esa interface
//        inter.hagoAlgo(55);

        if(inter instanceof Clase){
            Clase aux=(Clase)inter;
            aux.metodoDeClase();
        }
    }
}
