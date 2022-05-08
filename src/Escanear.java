
import java.util.Scanner;


public class Escanear {
    public static void main(String args[]){
        System.out.println("Escribe tu nombre");
        Scanner consola = new Scanner(System.in); 
        var usuario = consola.nextLine();
        System.out.println("Tu nombre es " + usuario);
        System.out.println("Escribe tu titulo");
        String titulo = consola.nextLine(); 
        System.out.println("Tu titulo es " + titulo);
        System.out.println("Entonces tu titulo es " + titulo + " y tu nombre es " + usuario);
        System.out.println("Bienvenido " + titulo + " " + usuario);
    }    
}
