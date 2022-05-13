/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class NumeroTexto {
    public static void main(String[] args){
        
        int numero = 5;
        String numeroTexto;
        
        switch(numero){
            case 1: numeroTexto = "Numero Uno";
                break;
            case 2: numeroTexto = "Numero Dos";
                break;
            case 3: numeroTexto = "Numero Tres";
                break;
            case 4: numeroTexto = "Numero Cuatro";
                break;
            default: numeroTexto = "Numero Desconocido";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
    
}
