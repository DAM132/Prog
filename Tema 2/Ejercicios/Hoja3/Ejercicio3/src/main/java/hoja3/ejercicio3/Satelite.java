/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio3;

/**
 *
 * @author Gines
 */
public class Satelite {

    private int meridiano, paralelo, distancia;

    public Satelite() {
        meridiano = 0;
        paralelo = 0;
        distancia = 0;
    }

    public Satelite(int meridiano, int paralelo, int distancia) {
        this.meridiano = meridiano;
        this.paralelo = paralelo;
        this.distancia = distancia;

    }

    public void printPosicion() {
        System.out.println(meridiano + paralelo + distancia);
    }

    public void vAltura(int desplazamiento) {
       distancia=distancia+desplazamiento;
      
    }
    
    public void vPosicion(int meridiano, int paralelo) {
        this.meridiano=meridiano;
        this.paralelo=paralelo;
    }

    public boolean enOrbita() {
        boolean resultado;
        resultado= (distancia <16000) ? false : true;
        return resultado;
       

    }

  

}
