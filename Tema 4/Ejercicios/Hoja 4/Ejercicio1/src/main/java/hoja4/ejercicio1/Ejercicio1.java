/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja4.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int matriz1[][] = {
            {101, 102, 103, 104, 105},
            {201, 202, 203, 204, 205},
            {301, 302, 303, 304, 305},
            {401, 402, 403, 404, 405},
            {501, 502, 503, 504, 505}
        };
        

       Scanner in = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
       do{
           System.out.println("1.-Elegir fila. Pide el número de fila por teclado y muestra elementos de esa fila.\n" +
"Comprueba que el número de fila sea válido.");
           System.out.println("2.- Elegir columna. Pide el número de columna por teclado y muestra los elementos de\n" +
"esa columna. Comprueba que el número de columna sea válido.");
           System.out.println("3.- Mostrar los elementos de la diagonal");
           System.out.println("4.- Mostrar los elementos de la diagonal inversa");
           System.out.println("5.- Mostrar los elementos de la diagonal hacia arriba");
           System.out.println("6.- Salir");
           System.out.println("Escribe una de las opciones");
           opcion = in.nextInt();
           switch(opcion){
               case 1:
                 metodo1(matriz1);
                  
                   break;
               case 2:
                   metodo2(matriz1);
                  
                   break;
                case 3:
                   Ejercicio1.metodo3(matriz1);
                   break;
                case 4:
                                       metodo4(matriz1);

                   
                   break;
                case 5:  
                                     metodo5(matriz1);

                    break;
                case 6:
                    salir=true;
                    break;
                   
                default:
                   System.out.println("Solo números entre 1 y 6");
           }
       }
      while(!salir);
        
        
      
        }//fin del main
    
     public static void metodo1(int [][] matriz1) {
 int fila;
 Scanner in= new Scanner(System.in);
                  do
                  {System.out.println("Dime la fila");
                   fila=in.nextInt();
                      
                  }
                   while(fila<0 || fila>matriz1.length);
                  
                   for (int i = 0; i < matriz1[fila-1].length; i++) {
                       System.out.print(matriz1[fila-1][i]+" ");
                       
                       
                   }
                   System.out.println("");

}
     
     public static void metodo2(int [][] matriz1){
             int c;
             Scanner in= new Scanner(System.in);
                  do
                  {System.out.println("Dime la fila");
                   c=in.nextInt();
                      
                  }
                   while(c<0 || c>matriz1[0].length);
                  
                   for (int i = 0; i < matriz1[c-1].length; i++) {
                       System.out.print(matriz1[i][c-1]+" ");
                       
                       
                   }
                   System.out.println("");
                 
         
     }
     
     public static void metodo3(int [][] matriz1){
       
          System.out.println("La diagonal es");
                    for (int i = 0, j=0; i < matriz1.length; i++,j++) {
                        
                       System.out.print(matriz1[i][j]+" ");
                    
                    }
                     System.out.println("");
                   
         
     }
     
     public static void metodo4(int [][] matriz1){
          System.out.println("La diagonal inversa");
                    for (int i = 0, j=matriz1.length-1; i <matriz1.length; i++,j--) {
                        
                       System.out.print(matriz1[i][j]+" ");
                    
                    }
                     System.out.println("");
                   
     }
     
      public static void metodo5(int [][] matriz1){
             System.out.println("La diagonal hacia arriba");
                    for (int i = matriz1.length-1, j=matriz1.length-1; i >=0; i--,j--) {
                        
                       System.out.print(matriz1[i][j]+" ");
                    
                    }
                     System.out.println("");
                    
     }
      
      
     
     

    
    }// fin de la clase





