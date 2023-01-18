/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja10.ejercicio1;

/**
 *
 * @author Ginés
 */
public class Multiplicar {
    
    private int m[][];

    public Multiplicar() {
        m= new int [10][10];
        for (int i = 0; i < m.length; i++) {
            m[i][0]=i;
            m[0][i]=i;
        }
        
    }
    
    public void Multiplicar(){
        for (int i = 1; i < m.length; i++) {
            for (int j = 1; j < m.length; j++) {
                 m[i][j]=m[0][j]*m[i][0];

            }
            
            
//           m[1][i]=m[0][i]*m[0][1];
            
        }
    }
            
            
            
public void mostrar(){
    for (int i = 0; i < m.length; i++) {
        System.out.println("");
        for (int j = 0; j < m.length; j++) {
            System.out.print(m[i][j]+"\t");
            
            
        }
       
        
    }
    System.out.println("");
}    
    
public int[] valoresAspa(){
    int a[]=new int [20];
    int cont=0;
    
   
        
    for (int i = 0; i < m.length; i++) {
        a[cont]=m[i][i];
        cont++;
        
    }
      
    for (int i = m.length-1; i > 0; i--) {
       a[cont]=m[i][i];
       cont++;
    }
        return a;
        
        
        
   
    
     
   
        
}

public int [] tablaMultiplicar(int num){
    int a[]=new int [10];
   int  cont=0;
    
    for (int i = 0; i < m.length; i++) {
        a[cont]=m[num][i];
        cont++;
    }
    
  
        return a;
    
    
}


}
