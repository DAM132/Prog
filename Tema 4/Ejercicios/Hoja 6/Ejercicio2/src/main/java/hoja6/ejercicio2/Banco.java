/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Banco {
    private Cliente [] usuario;
    private int contUser=0,codcliente=0;

    public Banco(int n) {
        usuario= new Cliente [n];
        
    }
    
    public void ingresar(){
        if(usuario.length>contUser)
           codcliente++;
        usuario[contUser]=new Cliente();
        usuario[contUser].setCodigo(codcliente);
        
        
        contUser++;
        
    }
    
    public String buscar(int num){
        String cadena="";
        boolean encontrado=false;
        
        for (int i = 0; i < contUser; i++) {
            if(usuario[i].getCodigo()==num){
                cadena=usuario[i].toString();
                encontrado=true;
            }
            
        }
        if(!encontrado){
            cadena="usuario no encontrado";
        }
        return cadena;
        
    }
    
    public String eliminar1(int num){
         String cadena="";
        boolean encontrado=false;
        
        for (int i = 0; i < contUser; i++) {
            if(usuario[i].getCodigo()==num){
                usuario[i]=usuario[contUser-1];
                 encontrado=true;
                 contUser--;
            }
           
            
        }
        if(encontrado){
           cadena="lo borre";
        }
        else{
            cadena="usuario no encontrado";
        }
        return cadena;
       
    }
    
    
    
    
    
    
     public String eliminar2(int num){
         String cadena="";
        boolean encontrado=false;
        
        for (int i = 0; i < contUser; i++) {
            if(usuario[i].getCodigo()==num){
                for (int j = i; j < contUser-1; j++) {
                    usuario[j]=usuario[j+1];
                }
                 encontrado=true;
                 contUser--;
            }
           
            
        }
        if(encontrado){
           cadena="lo borre";
        }
        else{
            cadena="usuario no encontrado";
        }
        return cadena;
       
    }
    
    
    
    public void mostrar(){
        for (int i = 0; i <contUser ; i++) {
            
            System.out.println(usuario[i].toString());
        }
   
    }
    
}
