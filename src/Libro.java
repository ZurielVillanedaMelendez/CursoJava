
import java.util.Scanner;


public class Libro {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Proporciona el titulo");
        String titulo = in.nextLine();
        System.out.println("Proporciona el autor");
        String autor = in.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    
    }
    
}
