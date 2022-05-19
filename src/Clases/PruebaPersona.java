/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author user
 */
public class PruebaPersona {
    public static void main(String[] args) {
        Persona perso1 = new Persona();
        perso1.nombre = "Zuriel";
        perso1.apellido = "Villaneda";
        perso1.obtenerInformacion();
        
        Persona p2 = new Persona();
        p2.nombre = "Marina";
        p2.apellido = "Flores";
        p2.obtenerInformacion();
    }
}
