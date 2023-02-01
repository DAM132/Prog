/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja4.ejercicio1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Ejercicio1 {

    public static void main(String[] args) {
//En la clase principal crear un array de publicaciones y llenarlo preguntando al usuario
//que publicación quiere insertar y los datos de ésta.
Scanner in= new Scanner(System.in);
Publicacion [] p; 
        p = new Publicacion [10];
       //lleno publicaciones con libros 
        for (int i = 0; i < p.length/2; i++) {
            p[i]=new Libro(1000+i,"eee"+i,"eee"+i,01,1+i,2022+i);
        }
      
      //lleno publicaciones con discos   
        for (int i = p.length/2; i < p.length; i++) {
              p[i]=new Disco(i,"eee"+i,"eee"+i,1+i,1+i,2022+i);
        }
        
        
        System.out.println("Muestro los datos de los libros");
        
        for (int i = 0; i < 10; i++) {
            System.out.println(p[i].toString());
        }
        
        System.out.println("Visualizar las 3 primerar letras del título y autor del disco de más larga duración.");
        apartadoc(p);
        
        System.out.println("Visualizar libro");
        apartadod(p);
        
        System.out.println("Ultimos años");
        apartadoe(p);
    }
    
    
    public static void apartadoc(Publicacion p[]){
        int aux=Integer.MIN_VALUE;
        int aux1=0;
        for (int i = 0; i < p.length; i++) {
            if(p[i] instanceof Disco){
              Disco  d= (Disco) p[i];
              if(aux<d.getDuracionMinutos())
                  aux=d.getDuracionMinutos();
              aux1=i;
            }
           
    }
    System.out.println("Titulo  " +p[aux1].getTitulo().substring(0, 3)+" "+"autor  "+p[aux1].getAutor() );
}
    
    
    public static void apartadod(Publicacion p[]){
        String aux="";
        
        for (int i = 0; i < p.length; i++) {
            if(p[i] instanceof Libro){
                 Libro  l= (Libro) p[i];
                 if(l.getNumPaginas()>1000&&p[i].fecha.getMonthValue()==LocalDate.now().getMonthValue()&&p[i].fecha.getYear()==LocalDate.now().getYear())
                aux+=l.toString();
            }
        }
        System.out.println(aux);
    }
    
    public static void apartadoe(Publicacion p[]){
        for (int i = 0; i < p.length; i++) {
            if(p[i] instanceof Libro){
                 Libro  l= (Libro) p[i];
                 if(p[i].fecha.getYear()<= LocalDate.now().getYear()-2)
                    System.out.println(p[i].toString());
            }
        }
    }
}
