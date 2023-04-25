/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tema7.ejercicio1;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;



/**
 *
 * @author DAM132
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        File f= new File("datos.dat");
         Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guardaremos la opcion del usuario
       do{
           System.out.println("1. Añadir factura.");
           System.out.println("2. Listado mororos");
           System.out.println("3. Eliminar fichero");
           System.out.println("4. Salir");
           System.out.println("Escribe una de las opciones");
           opcion = sn.nextInt();
           switch(opcion){
               case 1:
                   System.out.println("Has seleccionado la opcion 1");
                   Escribir(f);
                   break;
               case 2:
                   System.out.println("Has seleccionado la opcion 2");
                   Leer(f);
                   break;
                case 3:
                   System.out.println("Has seleccionado la opcion 3");
                   boolean aux= false;
                   //no  se puede delete a secas hay que hacer exists porque si no existe no puede borrarse 
                   if(f.exists())
                   {
                    f.delete();
                    aux=true;
                   }
                   
                
                
                   break;
                case 4:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
           }
       }
      while(!salir);
    
    }
    
    
     public static void Escribir(File f) {
        ObjectOutputStream fo = null;
        String nombre;
        int nfactura;
        double importe;
        boolean pagado;
        try {
            if(f.exists()){
                fo=new MiObjectOutputStream(new FileOutputStream(f,true));
               
            }else{
                fo = new ObjectOutputStream(new FileOutputStream(f));
            }
            nombre= Teclado.EsTexto("Dime un nombre");
            nfactura= Teclado.esEntero("Dime un nfactura");
            importe= Teclado.Esdouble("Dime un importe");
            pagado= Teclado.EsBoolean("Dime si esta pagada o no");
           
            
            Factura factura= new Factura(nfactura,importe,pagado,nombre);        
                    
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

    public static void Leer(File f) {
        ObjectInputStream os = null;
        try {
            os = new ObjectInputStream(new FileInputStream(f));
            Factura fac;
            while (true) {
                fac = (Factura) os.readObject();//Casting necesario 
                
                if(!fac.isPagado())
                System.out.println(fac.toString());
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
}
