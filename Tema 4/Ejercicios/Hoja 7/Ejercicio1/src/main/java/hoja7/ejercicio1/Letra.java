/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja7.ejercicio1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Ginés
 */
public class Letra{
        
    private int numletra;
    private double importe;
    private String titular;
    private LocalDate fechaVec;

    public Letra() {
        Scanner in= new Scanner(System.in);
        System.out.println("Cual es el nombre del titular?");
        titular=in.nextLine();
        System.out.println("Cual es el importe");
        importe= in.nextDouble();
        System.out.println("Fecha de vec");
        DateTimeFormatter formateo = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        fechaVec = LocalDate.parse(in.next(), formateo);

    }
    
    public boolean vencida(){
        boolean aux=false;
        if(fechaVec.isBefore(LocalDate.now())){
            aux=true;
        }
        return aux;
    }
    
    public void demora(int dias){
                
                fechaVec= fechaVec.plusDays(dias);
    }
    
    public long diasFaltan(){
        
        long dias = ChronoUnit.DAYS.between( LocalDate.now(),fechaVec);
        
        return dias;
        
    }
    
    public void mostrar() {
        DateTimeFormatter formateo = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("El numero de letra "
                + numletra + "\n" + "importe " + importe +"\n"+ "titular " + titular +"\n"+ "Vencimiento " + fechaVec.format(formateo)
        );
    }
    
    public int devuelveMes(){
        int mes;
        mes=fechaVec.getMonthValue();
        return mes;
    }

    public String getTitular() {
        return titular;
    }
    
    
    
    
    
    
}
