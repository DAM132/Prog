/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja6.ejercicio1;

/**
 *
 * @author gines
 */
public class Taller {
    private int aceite,ruedas,contadorCambiosTotales,contadorCambiosParciales;

    public Taller(double bidon, int ruedas) {
        bidon=0;
        ruedas=0;
        aceite = (int) (bidon*5);
        this.ruedas = ruedas;
    }
    
    public void addAceite(int bidon){
        this.aceite=(bidon*5)+aceite;
    }
    
    public void addRuedas(int ruedas){
        this.ruedas=ruedas+this.ruedas;
    }
    
    public int getCambioCompletos(){
           int resul;

        if(ruedas/4>aceite/3){
           resul=ruedas/4; 
        }else{
            resul=aceite/3;}
        
        return resul;
     }
    
    public int getCambioParcial(){
        int resul;

        if(ruedas/2>aceite/3){
           resul=ruedas/2; 
        }else{
            resul=aceite/3;}
        
        return resul;
     }
    
    public boolean cambioCompleto(){
        boolean aux=false;
        if(getCambioCompletos()>0){
        aceite=this.aceite-3;
        ruedas=this.ruedas-4;
        contadorCambiosTotales++;
        aux=true;
        }
      return aux;
    }
    
    public boolean cambioParcial(){
          boolean aux=false;
        if(getCambioCompletos()>0){
        aceite=this.aceite-3;
        ruedas=this.ruedas-2;
        contadorCambiosTotales++;
        aux=true;
        }
      return aux;
    }
    

    public int getRuedas() {
        return ruedas;
    }

    public int getAceite() {
        return aceite;
       
    }

    @Override
    public String toString() {
 double ingresos=contadorCambiosTotales*4*50+contadorCambiosTotales*3*5;
        ingresos=ingresos+contadorCambiosParciales*2*60+contadorCambiosParciales*3*4.5;
        return "TALLER:\n\tEXISTENCIAS:\n\t\tRuedas: "+ruedas+"\n\t\tAceite: "+aceite+"\n\tINGRESOS: Total: "+ingresos+"€";    }


    
    
    
}
 

    
    
    
    
    
    
    

