/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.ejemplo6;

/**
 *
 * @author DAM103
 */
public class Ejemplo6 {
//tipo enumerado fuera del main
    public enum tipoBase{ROJO, AMARILLO, VERDE} //public enum, de enumerado, puedes añadir los valores que quieras, no lleva ";" al final. 
    //Puedo decirle los posibles valores que quiero que tengan
    
    public static void main(String[] args) {
        
        tipoBase semaforo;
        
        semaforo=tipoBase.VERDE; //tenemos que añadir el nombre del enum seguido de un "."
        
        System.out.println(semaforo);
    }
}
