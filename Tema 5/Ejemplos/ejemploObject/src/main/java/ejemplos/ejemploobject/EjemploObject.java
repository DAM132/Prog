/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.ejemploobject;

/**
 *
 * @author Nuria
 */
public class EjemploObject {

    public static void main(String[] args) {
        //prueba de un método estático con argumento de tipo Object
        Clase.metodo(3);
        Clase.metodo(new String("Hola caracola"));
        Clase.metodo(args);
        //prueba del equals sin implementar e implementado
        Clase c1=new Clase("Renault","Megane","1234abc");
        Clase c2=c1;
        
        if(c1==c2){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
        if(c1.equals(c2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
        c2=new Clase("Renault","Megane","1234abc");
        if(c1==c2){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
        if(c1.equals(c2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
        //prueba del compareTo implementando la interfaz Comparable
        System.out.println("Si devuelve 0 son iguales: "+c1.compareTo(c2));
    }
}
