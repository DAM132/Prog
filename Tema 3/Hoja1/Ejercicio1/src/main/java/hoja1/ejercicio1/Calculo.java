/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author gines
 */
public class Calculo {

    private Scanner in= new Scanner(System.in );

    public Calculo() {
    }

    public void metodo1() {
        System.out.println("Metodo 1 \n Dime el numero");
        int num;
        num = in.nextInt();
        if(num>100&&num<1000){
            System.out.println("Esta emtre 100 y 1000");
        }
        System.out.println("No esta comprendido");
    }
    
     public void metodo2() {
        System.out.println("Metodo 2 \n\rDime el numero");
        int num;
        num= in.nextInt();
        if(num<0){
            System.out.println("es negativo");
            
        }
        else if(num==0){
            System.out.println("es null");
            
        }
        else if(num>0){
            System.out.println("es Positivo");
            
        }
     }
        
        public void metodo3() {
        System.out.println("Metodo 3 \n Dime el numero");
        int num;
        num=in.nextInt();
      if(num%5==0&&num%2==0){
            System.out.println("es divisible");
            
        }
        else {
            System.out.println("no es divisible");
            
        }
        
        }
        
    public void metodo4() {
        System.out.println("Metodo 4 \n Dime el numero");
        
        if(in.nextDouble()%1==0){
            System.out.println("Tiene decimales");
            
        }
        else {
            System.out.println("No tiene decimales");
            
        }  
        
    }
    
    public void metodo5(){
        System.out.println("Metodo 5 \n Dime el numero entre 1900 y 2100");
        int año;
        año= in.nextInt();
        if(año>=1900 && año<=2100){
        
        if (año%4==0&&(año%100==0&&año%400!=0)){
            System.out.println("es bisiesto");
        }
        
        else{
            System.out.println("no es bisiesto");
        }
        }
        else{
            System.out.println("no esta en rango");
        }
    }
    public void metodo6(){
        System.out.println("Metodo 6 \n Dime un numero");
        if(in.nextInt()%2==0){
            System.out.println("Es par");
            
    }
        else{
            System.out.println("es impar");
        }
    }

public void metodo7(){
    System.out.println("Metodo 7 \n dime un numero");
    int num;
    num=in.nextInt();
    if(num>=1&&num<=10){
        if(num%2==0){
            System.out.println("es par");
        }
        else{
            System.out.println("Es impar");
        }
    }
        else {
                System.out.println("no esta en rango");
                }
    }

public void metodo8(){
     System.out.println("Metodo 8 \n dime un numero a");
     
     int a;
     a=in.nextInt();
      System.out.println("dime un numero b");
     int b;
     b=in.nextInt();
      System.out.println("dime un numero c");
     int c;
     c=in.nextInt();
     
     if (a>b)
         if(a>c)
             if(b>c)
                 System.out.println("Es el mayor" + a + "Es el mediano" + b + "es el menor" + c);
             else 
                 System.out.println("Es el mayor" + a + "Es el mediano" + c  + "Es el menor" + b);
        else
                System.out.println("Es el mayor" + c + "Es el mediano" + a + "es el menor" + b);
     else if (b>c)
              if (b>a)
                  if (a>c)
                      System.out.println("Es el mayor" + b + "Es el mediano" + a + "Es el menor" + c);
                  else
                     System.out.println("Es el mayor" + b + "Es el mediano" + c + "es el menor" +a);
                else
                  System.out.println("Es el mayor" + a + "Es el mediano" + b + "es el menor" + c);
}
     //compruebo los mayores
//     if (b>a)
//         if(a<c)
//             if (b<c)
//                 System.out.println(a + " Es el menor " + b +" Es el mediano" + c + "Es el mayor" );
//             else
//                 System.out.println(a+ " Es el menor " + b +"  Es el mayor " + c +" es el menor");
//         else
//             System.out.println(a +" Es el mediano" + b +"Es el menor"  +c +"Es el mayor" );
//     else if(c>b)
//         if(c>a)
//             System.out.println(b+ " Es el menor " + a+"  Es el pequeño" + c+ "Es el mauor");
//     else 
//             System.out.println(b+ "Es el menor  " + c + "Es el mediano  " + a + "es el mayor");
//     else
//            System.out.println(c + "   " + b + "   "+ a);
//    }

    public void metodo9() {
        //variables
        int num1;
        int num2;
        System.out.println("Metodo 9 \n Dime un numero");
        num1 = in.nextInt();
        System.out.println("Dime un divisor");
        num2 = in.nextInt();
        //comprobación
        if(num1%num2==0){
            System.out.println(num2 + " es divisor de " +num1);
        }
        else {
            System.out.println(num2+" No es divisor de " +num1);
        }
    }
}
    
   
    

