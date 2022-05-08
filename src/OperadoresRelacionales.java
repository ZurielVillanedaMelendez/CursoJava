
public class OperadoresRelacionales {

    public static void main(String args[]) {
        int a = 3;
        var b = 2;
        var g = a > b;
        System.out.println("g = " + g);

        var h = a >= b;
        System.out.println("h = " + h);

        if (a % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es inpar");
        }

        var edad = 30;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor d eedad");
        }
        
        var edad2 = 15;
        if (edad2 >= adulto) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("NO es mayor de edad");
        }

    }
}
