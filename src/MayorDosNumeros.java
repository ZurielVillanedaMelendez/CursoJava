
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class MayorDosNumeros {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa el numero a evaluar");
        int numeroUno = consola.nextInt();
        System.out.println("Ingresa el segundo numero a evaluar");
        int numeroDos = consola.nextInt();

        if (numeroUno > numeroDos) {

            System.out.println("El numero mas grande es: " + numeroUno);
        } else if (numeroUno < numeroDos) {
            System.out.println("El numero mas grande es: " + numeroDos);

        } else {
            System.out.println("EL numero es igual");
        }

    }
}
