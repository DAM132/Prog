/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio7;

/**
 *
 * @author gines
 */
public class Operaciones {
    private int num;

    public Operaciones(int num) {
        this.num = num;
    }
    
    public void metodo1(){
        int contador=0;
        int aux=num;
        for (;aux>0;) {
           aux=aux/10;
           contador++;
        }
        System.out.println(contador);
    }
    
    public void metodo2(){
        for (int i = 0; i <=10; i++) {
            int aux;
            aux=num*i;
            System.out.println(aux);
            
        }
    }
        
   public void metodo3(){
       int suma=0;
       for (int i = 1; i < num; i++) {
           if(num%i==0){
               suma=suma+i;
           }
           
       }
       if(suma==num){
           System.out.println("perfecto");
       }
       else{
           System.out.println("No es perfecto");
       }
   }
  
   
     
    }

