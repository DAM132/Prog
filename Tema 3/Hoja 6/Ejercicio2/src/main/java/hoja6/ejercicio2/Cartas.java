/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio2;

import java.util.Random;

/**
 *
 * @author gines
 */
public class Cartas {
    public enum palo
{
    espada,copas,oros,bastos
}
 Random r = new Random();
 private palo p;
 private int num;
 private int aux= r.nextInt(4)+1;

    public Cartas() {
        num=r.nextInt(10)+1;
        if(aux==1){
            p=p.bastos;
        }
        else if(aux==2){
            p=p.copas;
        }
        else if(aux==3){
            p=p.espada;
        }
        else if(aux==4){
            p=p.oros;
        }
     
    }

    @Override
    public String toString() {
        return "Cartas{" + "p=" + p + ", num=" + num + '}';
    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

    public palo getP() {
        return p;
    }

    public void setP(palo p) {
        this.p = p;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getAux() {
        return aux;
    }

    public void setAux(int aux) {
        this.aux = aux;
    }
    
    
    
    
  
        
    
    
}
