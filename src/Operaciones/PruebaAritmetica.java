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
        //Variable local al metodo static void 
        ari1.a = 2;
        ari1.b = 5;
        ari1.sumar();
        
        int resultado = ari1.sumarRetorno();
        System.out.println("resultado bacano = " + resultado);
        
        resultado = ari1.sumarArgumentos(8, 8);
        System.out.println("resultado con argumentos = " + resultado);
        
         Aritmetica ari2 = new Aritmetica(2, 2);
         System.out.println("ari2 a = " + ari2.a);
         System.out.println("ari2 b = " + ari2.b);
         
         

    }
    
    public void metodo(){
        //no se pueden ocupar variables de otro metodo
        //a = 2;
    }
    
}
