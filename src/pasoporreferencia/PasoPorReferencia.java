/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporreferencia;

import Clases.Persona;

/**
 *
 * @author user
 */
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona ();
        
        persona1.nombre = "Zuriel";
        System.out.println("persona1 = " + persona1.nombre);
        cambioValor(persona1);
        System.out.println("persona1  nueva = " + persona1.nombre);
        
    }
    public static void cambioValor(Persona persona){
        persona.nombre = "Rugal";
    }
}
