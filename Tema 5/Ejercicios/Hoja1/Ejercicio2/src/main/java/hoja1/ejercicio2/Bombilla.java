/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio2;

/**
 *
 * @author Ginés
 */


     enum Estado
{
    On, Off
}

public class Bombilla {
    
    private static Estado interruptorg=Estado.Off;
private Estado interruptor=Estado.Off;
    public Bombilla() {
    }

    public static Estado getInterruptorg() {
        return interruptorg;
    }
    
    public void Bcambio(){
       if(interruptor==Estado.Off)
           interruptor=Estado.On;
       
       else if(interruptor==Estado.On)
           interruptor=Estado.Off;
    }
    
      
    public static void Gcambio(){
       if(interruptorg==Estado.Off)
           interruptorg=Estado.On;
       
       else if(interruptorg==Estado.On)
           interruptorg=Estado.Off;
    }

//public void Luciendo(){
//    if(interruptor==Estado.Off||interruptorg==Estado.Off)
//        System.out.println("Esta apagado");
//    else if(interruptor==Estado.On&&interruptorg==Estado.On)
//        System.out.println("Esta encendida");
//}  
//    
    
public boolean luce(){
    
        return (interruptor==Estado.On&&interruptorg==Estado.On);
    
}
}

