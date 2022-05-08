
import java.util.Scanner;

public class Conversion_primitivo {
    public static void main(String args[]){
        //Convertir un string a un tipo int
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);
        
        double numPi =Double.parseDouble("3.1416");
        System.out.println("numPi = " + numPi);
        
        var consola = new Scanner(System.in);
        System.out.println("Por favor porporciona tu edad: ");
        edad = Integer.parseInt( consola.nextLine() );
        System.out.println("Tu edad es igual a: " + edad);
        
        var edadtexto = String.valueOf(10);
        System.out.println("edadtexto = " + edadtexto);
        
        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
    }
    
}
