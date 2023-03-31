/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejemplos.ejemplofile;

import java.io.File;

/**
 *
 * @author Nuria
 */
public class EjemploFile {

    public static void main(String[] args) {
        var f=new File("D:\\Usuarios\\DAM132\\Documents\\prueba\\prueba.txt");
        if(f.exists()){
            System.out.println("El fichero existe");
        }else{
            System.out.println("El fichero no existe");
        }
    }
}
