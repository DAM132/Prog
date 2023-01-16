/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja9.ejercicio2;

/**
 *
 * @author Ginés
 */
public class Persona  {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

 
    
   public boolean esMayoredad(){
       boolean resul=false;
    if(edad>18){
        resul=true;
    }
        return resul;
  
}

    public String imprimir() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

 
    public static void main(String[] args) {
               if(args.length==2){
                   String nombre=args[0];
            int edad=Integer.parseInt(args[1]);
            Persona p=new Persona(nombre,edad);
            
                   System.out.println(p.imprimir());
                   if(p.esMayoredad())
                       System.out.println("Eres grande");
                   else 
                       System.out.println("no eres tan grande");
      
            
        }
        
        
        
    }
}
