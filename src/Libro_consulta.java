
import java.util.Scanner;

public class Libro_consulta {
    public static void main (String args[]){
     
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor proporciona el nombre del libro");
        String nombre = in.nextLine();
        System.out.println("Por favor proporciona el id");
        int id = Integer.parseInt(in.nextLine());
        System.out.println("Por favor proporciona el precio del libro");
        double precio = Double.parseDouble(in.nextLine());
        System.out.println("Por favor proporciona el envio gratuito");
        boolean envioGratis = Boolean.parseBoolean(in.nextLine());
        System.out.println("Los datos que proporcionaste fueron");
        System.out.println("Nombre del libro: " + nombre);
        System.out.println("Id del libro: " + id);
        System.out.println("El precio del libro es: $" + precio);
        System.out.println("Envio gratuito: " + envioGratis);
    }
    
}
