/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatico;

/**
 *
 * @author Nuria
 */
public class Estatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(Bicicleta.getNumeroDeBicicletas());
        
        
        Bicicleta bici1 = new Bicicleta(21, 27, 0);
        Bicicleta bici2 = new Bicicleta(18, 24, 0);

        System.out.println(bici1);
        System.out.println(bici2);
//aunque se puede llamar a un metodo estatico no se hace se llama con el nombre de la clase 
        System.out.println(bici1.getNumeroDeBicicletas());
        System.out.println(Bicicleta.getNumeroDeBicicletas());
    }

}
