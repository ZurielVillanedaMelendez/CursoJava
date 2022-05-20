/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author user
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica ari1 = new Aritmetica();
        
        ari1.a = 2;
        ari1.b = 5;
        ari1.sumar();
        
        int resultado = ari1.sumarRetorno();
        System.out.println("resultado bacano = " + resultado);
    }
}
