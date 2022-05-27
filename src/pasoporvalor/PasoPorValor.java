/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporvalor;

/**
 *
 * @author user
 */
public class PasoPorValor {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x = " + x);
        pasarNumero(x);
        System.out.println(" nuevo x = " +  x);
    }
    
    public static void pasarNumero(int arg1){
        System.out.println("arg1 = " + arg1);
        arg1 = 15;
    }
}
