
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class CalificacionPromedio {
    public static void main (String[] args){
        
        Scanner consola = new Scanner(System.in);
        System.out.println("¿Hola cual es el promedio que sacaste?");
        float calificacion = consola.nextFloat();
        
        if(calificacion <= 10 && calificacion >9){
            System.out.println("A");
        }else if(calificacion < 9 && calificacion > 8){
            System.out.println("B");
        }else if(calificacion < 8 && calificacion > 7){
            System.out.println("C");
        }else if(calificacion < 7 && calificacion > 6 ){
            System.out.println("D");
        }else if(calificacion < 6 && calificacion > 0 ){
            System.out.println("F");
        }else{
            System.out.println("Numero no valido");
        }
    }
}
