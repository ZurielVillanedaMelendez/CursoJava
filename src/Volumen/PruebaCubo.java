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
public class PruebaCubo {
    public static void main(String[] args){
        
        int medidaAncho = 3;
        int medidaAlto = 2;
        int medidaProf = 6;

        Cubo caja = new Cubo();
        caja.ancho = medidaAncho;
        caja.largo = medidaAlto;
        caja.profundo = medidaProf;
        int resultado = caja.calcularVolumen();
        System.out.println("resultado = " + resultado);
        
        Cubo caja1 = new Cubo(2, 2, 2);
        System.out.println("caja1 = " + caja1.calcularVolumen());
    }
}
