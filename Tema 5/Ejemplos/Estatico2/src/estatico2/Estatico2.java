/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatico2;

/**
 *
 * @author Nuria
 */
public class Estatico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Interfaz.metodoEstatico();
        Clase c1 = new Clase();
        c1.metodo();
        c1.metodoPorDefecto();

        Clase2 c2 = new Clase2();

        c2.metodo();
        c2.metodoPorDefecto();

        
        
        
    }

}
