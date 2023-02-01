/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja4.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Empleado {
    protected String nombre, departamento;
    protected boolean casado;
    protected int edad;
    protected double salario;

    public Empleado() {
         char  c;
        Scanner in= new Scanner(System.in);
        System.out.println("Dime el nombre del empleado");
        nombre=in.nextLine();
         System.out.println("Dime el departamento del empleado");
         departamento=in.nextLine();
          
          
          do{
            System.out.println("Dime si esta casado el empleado");  
           c=in.nextLine().charAt(0);
            
            if(c=='s'){
                casado=true;
            }
            else if(c=='n'){
                casado=false;
            }
                
          }
       
          while(c!='s'&&c!='n');
      
           do{     
               
               System.out.println("Dime la edad del empleado");
                edad=in.nextInt();
           }
          while(edad<=18||edad>=65);
           
           
            System.out.println("Dime el salario del empleado");
            salario=in.nextDouble();
    }

    public Empleado(String nombre, String departamento, boolean casado, int edad, double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.casado = casado;
        this.edad = edad;
        this.salario = salario;
    }
    
    
    public void clasificacion(Empleado[]e){
        String aux1="";
        String aux2="";
        String aux3="";
        
    
        
        for (int i = 0; i < e.length; i++) {

        if(e[i].edad<=21)
           aux1+=e[i].toString()+"\n";
          
        else if(e[i].edad>=22 && e[i].edad<=35)    
    aux2+=e[i].toString()+"\n";
        
       else if(e[i].edad>35)    
    aux3=e[i].toString()+"\n";
        
        
        }
        
      
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", departamento=" + departamento + ", casado=" + casado + ", edad=" + edad + ", salario=" + salario + '}';
    }
    
    
}