/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class CalculoEstacionAñoDos {
    public static void main(String[] args){
        int mes = 10;
        String estacion = "Desconocida";
        
        switch(mes){
            case 1: case 2: case 12: 
                estacion = "Invierno";
                break;
            case 3: case 4: case 5: 
                estacion = "Primavera";
                break;
            case 6: case 7: case 8: 
                estacion = "Verano";
                break;
            case 9: case 10: case 11: 
                estacion = "Otoño";
                break;
            default: estacion = "No existe ese mes";  
        }
        System.out.println("estacion = " + estacion);
    }
}
