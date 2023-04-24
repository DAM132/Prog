/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema7.ejercicio6;

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
 * @author DAM132
 */
public class Ejercicio6 {

    public static void main(String[] args) {
       File f= new File("beca.bin");
        File faux = new File("datosbecacontrol.bin");
       
       tieneBeca(f, faux);
      
   
      leer(faux); 
      
       
    }
        
     public static void tieneBeca(File fichero, File faux) {
        String nombre, apellidos;
        char sexo;
          int edad, nsuspensos;
        int dinero=0;
        boolean residencia;
        double ingresos;
        
        FileInputStream f = null;
        DataInputStream fd = null;
        FileOutputStream fo= null;
        DataOutputStream fdo= null;
        boolean fin = false;
        try {
            //creamos un flujo hacia el fichero
       
            f = new FileInputStream(fichero);
            fd = new DataInputStream(new BufferedInputStream(f));
            fo = new FileOutputStream(faux, true);
            fdo = new DataOutputStream(new BufferedOutputStream(fo));
            do {
                nombre = fd.readUTF();
                apellidos = fd.readUTF();
                sexo = fd.readChar();
                edad = fd.readInt();
                nsuspensos = fd.readInt();
                residencia = fd.readBoolean();
                ingresos = fd.readDouble();
                 String hola="hola";
                  fdo.writeUTF(hola);
                  if(nsuspensos<=1){
                      dinero+=1500;
                      if(ingresos<=12000)
                   dinero+=500;
               else if (nsuspensos==0)
                   dinero+=500;
               else if(nsuspensos==1)
                   dinero+=200;
               else if(residencia)
                   dinero+=1000;
                   
                   fdo.writeUTF(nombre);
                 System.out.println(nombre);
               fdo.writeUTF(apellidos);
               fdo.writeChar(sexo);
               fdo.writeInt(edad);
               fdo.writeChar(nsuspensos);
               fdo.writeBoolean(residencia);
               fdo.writeDouble(ingresos);
               fdo.writeInt(dinero);
              
             
                   
                 
                    
                   
               }              

            } while (!fin);
//            
   

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
   
    
     public static void leer(File fichero) {
        String nombre, apellidos;
        char sexo;
        int edad, nsuspensos;
        boolean residencia;
        double ingresos;
        int dinero;

        FileInputStream f = null;
        DataInputStream fd = null;
        boolean fin = false;
        try {
            //creamos el 
            
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
                dinero=fd.readInt();
                System.out.println("Nombre " + nombre + "\nApellidos " + apellidos + "\n sexo " + sexo + "\n edad " + edad + 
                        "\nNumero suspensos" + nsuspensos + "\n dinero" + dinero);

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
