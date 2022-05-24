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
public class Aritmetica {
    int a, b;
    
    public Aritmetica(){
        System.out.println("Holabb");
    }
    
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
    } 
    
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarRetorno (){
        return a + b;
    }
    
    public int sumarArgumentos(int arg1, int arg2){
        a = arg1;
        b = arg2;
        
        return a + b;
    }
}
