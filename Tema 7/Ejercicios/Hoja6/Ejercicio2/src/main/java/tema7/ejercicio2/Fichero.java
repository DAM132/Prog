/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicio2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DAM132
 */
public class Fichero implements Serializable{

    private File f;

    public Fichero(String n) {

        this.f = new File(n);
    }

    public void Escribir() {
        ObjectOutputStream fo = null;
        String nombre, telefono, direccion;
        int cp;
        try {
            if (f.exists()) {
                fo = new MiObjectOutputStream(new FileOutputStream(f, true));

            } else {
                fo = new ObjectOutputStream(new FileOutputStream(f));
            }
            nombre = Teclado.EsTexto("Dime un nombre");
            telefono = Teclado.EsTexto("Dime un telefono");
            direccion = Teclado.EsTexto("Dime una direccion");
            cp = Teclado.esEntero("Dime un cp");

            Persona factura = new Persona(nombre, telefono, direccion, cp);

            fo.writeObject(factura);
        } catch (IOException ex) {
            System.err.println(ex.toString());
        } finally {
            if (fo != null) {
                try {
                    fo.close();
                } catch (IOException ex) {
                    System.out.println("Error de lectura");
                }
            }
        }
    }

    public void Leer() {
        ObjectInputStream os = null;
        try {
            os = new ObjectInputStream(new FileInputStream(f));
            Persona per;
            while (true) {
                per = (Persona) os.readObject();//Casting necesario
                System.out.println(per.toString());

            }
        } catch (EOFException e) {
            System.out.println("Se alcanzó el final");
        } catch (ClassNotFoundException e) {
            System.out.println("Error el tipo de objeto no es compatible");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
            }
        }
    }

    public  void buscar(String nombre) {
        ObjectInputStream os = null;
        ArrayList<Persona> array = new ArrayList();
        try {
            os = new ObjectInputStream(new FileInputStream(f));
            Persona fac;

            while (true) {
                fac = (Persona) os.readObject();//Casting necesario 

                array.add(fac);

            }
        } catch (EOFException e) {
            System.out.println("Se alcanzó el final");
        } catch (ClassNotFoundException e) {
            System.out.println("Error el tipo de objeto no es compatible");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
           
            for (Persona persona : array) {
                if(persona.getNombre().equalsIgnoreCase(nombre))
                    System.out.println(persona.toString());
                
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
            }
        }
    }

    public void borrarEntrada(String nombreentrada) {
        ObjectInputStream os = null;
        ArrayList<Persona> array = new ArrayList();
        ObjectOutputStream fo = null;

        try {

            os = new ObjectInputStream(new FileInputStream(f));
            Persona per;

            while (true) {
                per = (Persona) os.readObject();//Casting necesario 
               array.add(per);

            }
            
            
                    

        } catch (EOFException e) {
            System.out.println("Se alcanzó el final");
        } catch (ClassNotFoundException e) {
            System.out.println("Error el tipo de objeto no es compatible");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } finally {

            if (os != null) {
                try {
                    os.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar");
                }
            }
        }
        
        for (Persona persona : array) {
                if(persona.getNombre().compareToIgnoreCase(nombreentrada)){
                      boolean aux= true;
                }
                  
            }

        try {
            if (f.exists()) {
                fo = new MiObjectOutputStream(new FileOutputStream(f));

            } else {
                fo = new ObjectOutputStream(new FileOutputStream(f));
            }

            for (Persona persona : array) {
                fo.writeObject(persona);
            }

        } catch (IOException ex) {
            System.err.println(ex.toString());
        } finally {
            if (fo != null) {
                try {
                    fo.close();
                } catch (IOException ex) {
                    System.out.println("Error de lectura");
                }
            }
        }
    }
    
    public void eliminar(){
        if(f.exists())
        {
             f.delete();
             System.out.println("Se ha borrado correctamente");
        }
        else{
            System.out.println("No se ha borrado");
        }
           
        
    }

}
