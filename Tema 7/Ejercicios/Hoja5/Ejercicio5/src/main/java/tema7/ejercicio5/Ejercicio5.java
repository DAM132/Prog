/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema7.ejercicio5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Ginés
 */
public class Ejercicio5 {

    public static void main(String[] args) {
//Realizar un programa que lea de teclado (la entrada estándar) los siguientes datos:
//Nombre y apellido de un supuesto becario.
//Sexo (H/M)
//Edad (20/60)
//Numero de suspensos del curso anterior (0/4)
//Residencia familiar (SI/NO)
//Ingresos anuales de la familia.
//Los datos se almacenan en un fichero binario llamado “datosbeca.bin"

    }
    
    
     public static void crear(File fichero) {
        String nombre,apellidos;
        char sexo;
        int edad,nsuspensos;
        boolean residencia;
        double ingresos;
        
  FileOutputStream f = null;
        DataOutputStream fd = null;
        boolean resp;
        try {
            f = new FileOutputStream(fichero, true);
            fd = new DataOutputStream(new BufferedOutputStream(f));
            
           nombre= Teclado.EsTexto("Dime un nombre");
           apellidos= Teclado.EsTexto("Dime unos apellidos");
           sexo= Teclado.Sexo("Dime un sexo");
           edad= Teclado.esEntero("Dime la edad");
           nsuspensos= Teclado.esEntero("Dime el numero de suspensos");
           residencia=Teclado.EsBoolean("Dime si es residente o no");
           ingresos=Teclado.Esdouble("Dime ingresos");
           
           

            //lo grabamos en el fichero
            
            fd.writeUTF(nombre);
            fd.writeUTF(apellidos);
            fd.writeChar(sexo);
            fd.writeInt(nsuspensos);
            fd.writeBoolean(residencia);
            fd.writeDouble(ingresos);
            
            
            
        } catch (IOException ex) {
            System.out.println("error " + ex.toString());
        } finally {
            if (fd != null) 
      try {
                fd.close();
            } catch (IOException ex) {
      System.out.println("Error al cerrar el fichero.");
    }  
  }
  
   }
    
    
    public static void leer(File fichero) {
        String nombre, apellidos;
        char sexo;
        int edad, nsuspensos;
        boolean residencia;
        double ingresos;

        FileInputStream f = null;
        DataInputStream fd = null;
        boolean fin = false;
        try {
            //creamos un flujo hacia el fichero
            f = new FileInputStream(fichero);
            fd = new DataInputStream(new BufferedInputStream(f));
            do {
                nombre = fd.readUTF();
                apellidos = fd.readUTF();
                sexo = fd.readChar();
                edad = fd.readInt();
                nsuspensos = fd.readInt();
                residencia = fd.readBoolean();
                ingresos = fd.readDouble();
                System.out.println("Nombre " + nombre + "\nApellidos " + apellidos + "\n sexo " + sexo + "\n edad " + edad + 
                        "\nNumero suspensos" + nsuspensos);

            } while (!fin);

        } catch (EOFException eof) {
            fin = true;

  } catch (IOException ex) {
    System.out.println("error " + ex.toString());
  } finally {
    if (fd != null) 
      try {
      fd.close();
    } catch (IOException ex) {
      System.out.println("Error al cerrar el fichero.");
    }
  }
 
}
}
