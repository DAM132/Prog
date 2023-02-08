/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio2;

/**
 *
 * @author Ginés
 */
public class Mamifero{
    
    protected String raza,alimento;
    protected int npatas;

    public Mamifero(String raza, String alimento, int npatas) {
        this.raza = raza;
        this.alimento = alimento;
        this.npatas = npatas;
    }

    
    
    @Override
    public String toString() {
        return "Mamifero{" + "raza=" + raza + ", alimento=" + alimento + ", npatas=" + npatas + '}';
    }


    
}
