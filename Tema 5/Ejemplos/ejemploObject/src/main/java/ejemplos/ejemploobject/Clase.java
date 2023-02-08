/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.ejemploobject;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Nuria
 */
public class Clase implements Comparable{

    private String marca, modelo, matricula;

    public Clase(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }
    
    
    public static void metodo(Object o) {
        if (o instanceof String[]) {
            String[] aux=(String[])o;
            System.out.println(Arrays.toString(aux));
        } else {
            System.out.println("entro " + o.toString());
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Clase other = (Clase) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        int devolver=-1;
        if(o instanceof Clase){
            Clase aux=(Clase)o;
            devolver=this.matricula.compareTo(aux.matricula);
        }
        return devolver;
    }

  
    
    
}
