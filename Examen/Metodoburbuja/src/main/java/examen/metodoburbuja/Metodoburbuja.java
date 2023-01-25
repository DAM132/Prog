/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package examen.metodoburbuja;

import java.util.Random;

/**
 *
 * @author gines
 */
public class Metodoburbuja {

    public static void main(String[] args) {

int [] A= new int [10];        
int i, j ,aux;
 Random r = new Random();

        for (int k = 0; k < A.length - 1; k++) {
            A[k]= r.nextInt(10)+1;  // Entre 0 y 10 excluido, más 1, es decir, del 1 al 10 ambos incluidos.
            
        }
        
         for (int k = 0; k < A.length - 1; k++) {
            System.out.println(A[k]);
        }

for (i = 0; i < A.length - 1; i++) 
{
            for (j = 0; j < A.length - i - 1; j++)
            {                                                              
                if (A[j + 1] < A[j])
                {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                
                }
}
}

        for (int k = 0; k < A.length - 1; k++) {
            System.out.println(A[k]);
        }
    }
}
    
