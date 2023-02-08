/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio1;

/**
 *
 * @author Ginés
 */
public class AutoAnfibio implements TransporteMaritimo, TransporteTerrestre {
    protected String marca,modelo;

    @Override
    public void nadar() {
        System.out.println("Estoy nadando");
    
    }

    @Override
    public void andar() {

        System.out.println("Estoy andando");    
    }
}
