/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio1;

/**
 *
 * @author Gines
 */
public class Restaurante {
    
    private int huevos,docenas;
    private double chorizo;
    
    
    public Restaurante(int docenas,double chorizo){
        this.chorizo=chorizo*1000;
        huevos=docenas*12;
    }
    
    public void AddHuevos(int docenas){
        this.huevos=docenas*12+huevos;
    }
    
    public void AddChorizo(double n){
        this.chorizo=chorizo+n*1000;
    }
    
    public int getNumPlatos(){
        
       int resultado;
      if (chorizo/200>huevos/2){
          resultado= (int) (huevos/2);
          
      }
      else {
            resultado=(int) (chorizo/200);
    }
        return resultado;
    }
    
    //public void sirvePlato(int plato){
      //  this.chorizo=chorizo-200*plato;
        //this.huevos=huevos-2*plato;
    //}
    
      public boolean sirvePlato(){
       boolean aux=false;
          if(this.getNumPlatos()>0){
            huevos=huevos-2;
            chorizo=chorizo-200;
            aux=true;   
          }
          return aux;
    }
    
    public int getHuevos(){
        return huevos;
    }
    public double getChorizo(){
        return (chorizo/1000);
    }


    
}
