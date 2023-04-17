/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribirlineaalinea;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nuria
 */
public class EscribirLineaALinea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileWriter fr;
        BufferedWriter br = null;
        String frase;
        Scanner e = new Scanner(System.in);
        System.out.println("Escribe lo que te apetezca para añadir a otrofichero.txt");
        frase = e.nextLine();
        try {
            fr = new FileWriter("otroFichero.txt", true);
            br = new BufferedWriter(fr);
            br.write(frase.charAt(0));
            br.write(System.lineSeparator());
        } catch (IOException ex) {
            System.err.println(ex.toString());
        } finally {
            if (br != null)
		try {
                br.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar");
            }
        }
    }
}
