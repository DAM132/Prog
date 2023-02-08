/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.ejemploequalsycomparable;

import java.util.Arrays;

/**
 *
 * @author Nuria
 */
public class ListaPersona {
    private Persona[] persona;
    private int contador;

    public ListaPersona() {
        persona=new Persona[10];
        contador=0;
    }
    
    public void insertar(Persona p){
        if(contador<persona.length){
            persona[contador]=p;
            contador++;
        }
    }
    
    public void mostrar(){
        for (int i = 0; i < contador; i++) {
            System.out.println(persona[i].toString());
        }
    }
    
    public void ordenar(){
        Arrays.sort(persona, 0,contador);
    }
    
    public void buscar(Persona p){
        for (int i = 0; i < contador; i++) {
            if(persona[i].equals(p)){
                System.out.println("Encontrado en la posicion "+(i+1));
            }
        }
    }
}
