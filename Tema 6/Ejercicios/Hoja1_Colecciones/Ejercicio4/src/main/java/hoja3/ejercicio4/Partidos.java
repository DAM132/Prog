/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio4;

/**
 *
 * @author Ginés
 */
public class Partidos {
     private String eqloc,eqvis;
       private int golesloc,golesvis;

    public Partidos(String eqloc, String eqvis, int golesloc, int golesvis) {
        this.eqloc = eqloc;
        this.eqvis = eqvis;
        this.golesloc = golesloc;
        this.golesvis = golesvis;
    }

    @Override
    public String toString() {
        return "Partidos{" + "eqloc=" + eqloc + ", eqvis=" + eqvis + ", golesloc=" + golesloc + ", golesvis=" + golesvis + '}';
    }

    public String getEqloc() {
        return eqloc;
    }

    public void setEqloc(String eqloc) {
        this.eqloc = eqloc;
    }

    public String getEqvis() {
        return eqvis;
    }

    public void setEqvis(String eqvis) {
        this.eqvis = eqvis;
    }

    public int getGolesloc() {
        return golesloc;
    }

    public void setGolesloc(int golesloc) {
        this.golesloc = golesloc;
    }

    public int getGolesvis() {
        return golesvis;
    }

    public void setGolesvis(int golesvis) {
        this.golesvis = golesvis;
    }
    
}
