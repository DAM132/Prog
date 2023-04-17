/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7.ejercicio8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author DAM132
 */
public class Seguridad {
    
    private static int clave=5;
    
    public static void encriptar(File f){
        FileInputStream fi = null;
        FileOutputStream fo = null;
        File faux = null;
        int c;
        try {
            faux = new File("aux.txt");
            fi = new FileInputStream(f);
            fo = new FileOutputStream(faux);
            while ((c = fi.read()) != -1) {
                fo.write(c + clave);
            }
        } catch (FileNotFoundException e) {

            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            if (fi != null)
    try {
                fi.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero.");
            }

            if (fo != null && fi != null && faux != null)
                
            try {
                fo.close();

            } catch (IOException ex) {
                System.out.println("Error al cerrar el fichero.");
            }

        }
    }
    }
    

