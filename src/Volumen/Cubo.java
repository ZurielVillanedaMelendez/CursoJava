/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Volumen;

/**
 *
 * @author user
 */
public class Cubo {
    
    int ancho, largo, profundo;
    
    public Cubo(){
        System.out.println("Un constructor vacio");
    }
    
    public Cubo(int ancho, int largo, int profundo){
        this.ancho = ancho;
        this.largo = largo;
        this.profundo = profundo;
    }
    
    public int calcularVolumen(){
        return ancho * largo * profundo;
        
    }
}
