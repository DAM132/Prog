/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio1;

/**
 *
 * @author Ginés
 */
public class Curso {
    
    private String cod,desc;
    private int nHoras;

    public Curso() {
        cod=claseTeclado.EsTexto("Dime cod del curso");
        desc=claseTeclado.EsTexto("Dime desc del curso");
        nHoras=claseTeclado.esEntero("Dime numero de horas");
        
    }

    
    
    public Curso(String cod, String desc, int nHoras) {
        this.cod = cod;
        this.desc = desc;
        this.nHoras = nHoras;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getnHoras() {
        return nHoras;
    }

    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    @Override
    public String toString() {
        return "Curso{" + "cod=" + cod + ", desc=" + desc + ", nHoras=" + nHoras + '}';
    }
    
    
    
}
