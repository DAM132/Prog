/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Calculo {

    public void metodo1(){
        Scanner in=new Scanner(System.in);
        int n;
       
        System.out.println("Dime un numero");
        n=in.nextInt();
            
        for(int i=1;i<=n&&n%i==0;i++){
           if(n%i==0){
               System.out.println(i);
           }
        }
        
        }
    public void metodo2(){
         Scanner in=new Scanner(System.in);
        int num2,num1,aux,suma = 0;
        num2=in.nextInt();
        num1=in.nextInt();
       if(num2>num1){
           aux=num2;
           num1=num2;
           aux=num1;
        }
        for (int i = num2; i<num1; i++) {
            if(i%2!=0){
                System.out.println(i);
                suma=suma+i;
            }
            
        }
        System.out.println("La suma es" +suma);
    }
    public void metodo3(){
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("dime el numero");
        n=in.nextInt();
        for (int i = 1; i<=10; i++) {
            System.out.println(n+"multiplicador"+i+"es"+n*i);
            
        }
    }
    public void metodo4(){
        int num,div,fin;
        int i=0;
             Scanner in=new Scanner(System.in);
        System.out.println("dime el num");
      
        num=in.nextInt();
          System.out.println("dime el divisor");
        div=in.nextInt();
        int aux=num;
        System.out.println("divisor"+num/div);
        
        for (i=0; aux>=div; i++) {
            aux=aux-div;
           
            
        }
        System.out.println("cociente" + i);
        System.out.println("resto" + aux);
    }
}
    
    

