/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Profesor extends Persona {
    private String [] asignaturas;

    public Profesor(int n) {
        super();
        asignaturas= new String [n];
          Scanner in= new Scanner(System.in);
        for (int i = 0; i < asignaturas.length ; i++) {
            System.out.println("dime asignatura");
            asignaturas[i]=in.next();
    }

    
  
    
    
}

    @Override
    public String mostrar() {
        return super.mostrar()+"Dni" + getDni()+ "Profesor{" + "asignaturas \n" + Arrays.toString(asignaturas).toUpperCase() + '\n';
    }
    
}
