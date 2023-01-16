/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio1;

/**
 *
 * @author Ginés
 */
public class Figura {
    private char array [][];

    public Figura(int n, char c) {
        
        array = new char[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j]=c;
            }
            
        }
    }
    
    public String Cuadrado(){
        String cadena="";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                cadena+=array[i][j];
               
            }
             cadena+="\n";
        }
        
        return cadena;
        
    }
    
    public void cuadradoVacio(){
               
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(i==0||j==0||j==array[i].length-1||i==array.length-1){
                    System.out.print(array[i][j]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
            
        }

    }
    public void Aspa(){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i==j||(i+j)==array.length-1){
                    System.out.print(array[i][j]);
                }
                else{
                    System.out.print(" ");
                }
                   
                
            }
            System.out.println("");
        }
    }
    
}
