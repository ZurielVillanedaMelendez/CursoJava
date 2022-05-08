
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
public class AreaRectangulo {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("¿Cuanti mide la base?");
        int base = consola.nextInt();

        System.out.println("¿Cuanti mide la altura?");
        int altura = consola.nextInt();

        int area = base * altura;
        int perimetro = base * altura * 2;

        System.out.println("El area es = " + area + " y el perimetro es " + perimetro);
    }
}
