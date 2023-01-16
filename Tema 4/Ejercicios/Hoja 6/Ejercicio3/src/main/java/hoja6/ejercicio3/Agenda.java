/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Agenda {
    private int cont;
    private Persona [] pers;

    public Agenda (int dim) {
       cont=0;
     pers = new Persona [dim];
    }
    
    public void insertar(){
        Scanner in= new Scanner(System.in);
    if(pers.length>cont){
        String nombre,telefono;
        System.out.println("Dime el nombre");
        nombre=in.next();
        System.out.println("Dime el numero de telefono");
        telefono=in.next();
        pers[cont] = new Persona (nombre,telefono);
        cont++;
        
    }
    else{
        System.out.println("No quedan huecos libres en la agenda");
    }
}
    
    public void buscar(){
     Scanner in= new Scanner(System.in);
     String nombre;
     boolean enc=false;
     
        for (int i = 0; i < cont; i++) {
            System.out.println("Dime el nombre");
            nombre=in.next();
            if(pers[i].getNombre().equalsIgnoreCase(nombre)){
                System.out.println(pers[i].toString());
                enc=true;
            }
            
        }
        
        if(!enc){
            System.out.println("No existe ese nombre");
        }
        
   

    }
    
    public void modificar(){
           Scanner in= new Scanner(System.in);
     String nombre;
     boolean enc=false;
     
        for (int i = 0; i < cont; i++) {
            System.out.println("Dime el nombre");
            nombre=in.next();
            if(pers[i].getNombre().equalsIgnoreCase(nombre)){
                System.out.println("El telefono antiguo es");
                System.out.println(pers[i].getTelefono());
                System.out.println("Dime el nuevo telefono");
                pers[i].setTelefono(in.next());
                enc=true;
                
            }
            
        }
        if(!enc){
            System.out.println("No existe usuario");
        }
        
    }
            
            
    public void mostrar(){
        for (int i = 0; i < cont; i++) {
            System.out.println(pers[i].toString());
        }
    }
    
    public void usuarios(){
        System.out.println(cont);
    }
    
}
