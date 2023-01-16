/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Curso {
    private String nombre;
    private String [] alumno;
    private String curso;
  

    public Curso(int numalu) {
        Scanner in= new Scanner(System.in);
        System.out.println("Nombre de curso");
        curso=in.next();
        alumno=new String [numalu];
        
        
        for (int i = 0; i < alumno.length; i++) {
            System.out.println("Dime el nombre");
            alumno[i]=in.next();
            
        }
            
            
            
        }
        public void Iniciales(){
            for (int i = 0; i < alumno.length; i++) {
                System.out.println(alumno[i].charAt(0));
                
            }

}
   public void desplaza(){
      
       int i;
      String ultimo= alumno[alumno.length-1];
       for (i = alumno.length-1; i >0; i--) {
           alumno[i]=alumno[i-1];
       }
       alumno[0]=ultimo;
       
       
       
        
    }
   public void verNombre(int numalu){
        
        
       String aux;
       aux=alumno[numalu];
       System.out.println(aux);
           
       }
   
   public boolean EsDaw(){
       boolean aux=false;
       
       if(curso.contains("DAW")){
           aux=true;
       }
        return aux;
       
   }
    
  



    
}
