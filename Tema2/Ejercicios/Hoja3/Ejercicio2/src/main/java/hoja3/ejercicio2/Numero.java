/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio2;

/**
 *
 * @author Gines
 */


public class Numero {

    private int num;

    public Numero() {
        num = 0;
    }

    public Numero(int num) {
        this.num=num;
        
    }

    public void aniade(int num2) {
       num=num+num2;

    }
    
     public void resta(int num2) {
       num=num-num2;

    }
     
      public int getnum() {
        return num;
    }
      
      public int doble(){
          return num*2;
          
      }
    
     public int triple(){
          return (int) Math.pow(num, 3);
          
      }
       
      public void cambiar(int num){
          this.num=num;
          
      }
      
      public void setnum(int num){
          this.num=num;
      }
    
    

}
