/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class CalculoEstacionAño {
 
    public static void main(String[] args){
        
        int mes = 1;
        String estacion = "ESTACION DESCONOCIDA";
        
        if(mes == 1 || mes == 2 || mes == 12){
            estacion = "Invierno";
            System.out.println("La estaciones = " + estacion);
        }else if(mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
            System.out.println("La estaciones = " + estacion);
        }else if(mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
            System.out.println("La estaciones = " + estacion);
        }else if(mes == 10 || mes == 11 || mes == 9){
            estacion = "Otoño";
            System.out.println("La estaciones = " + estacion);
        }else{
            System.out.println(estacion);
        }        
        
    }
}
