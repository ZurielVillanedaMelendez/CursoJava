/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Etiquetas {
    // LAs etiqeutas son una mala practica ya que intervienen en la logica del
    // cilo de ejecucion del programa
     public static void main(String[] args) {
         
         inicio:
        for (int contador = 0; contador < 3; contador++) {
            if (contador % 2 == 0) {
                System.out.println("contador = " + contador);
                break inicio;
            }

        }
         end:
        for (int contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0) {
                continue end;
            }
            System.out.println("contador = " + contador);

        }
    }
}
