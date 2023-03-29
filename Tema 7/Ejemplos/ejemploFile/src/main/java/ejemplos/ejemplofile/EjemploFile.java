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
        File f=new File("E:\\Documents\\prueba.txt");
        File f1=new File("prueba.txt");
        if(f1.exists()){
            System.out.println("El fichero existe");
        }else{
            System.out.println("El fichero no existe");
        }
    }
}
