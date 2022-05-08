
public class OperadoresAsignacion {
    public static void main (String args[]){
        
        int a=2, b=3;
        int c = b + 5 - a;
        System.out.println("c = " + c);
        
        // = es el valor de asignacion
        // == es para evaluar si una expresion es igual
        
        a += 3;// esto es igual a = a + 3;
        System.out.println("+a = " + a);
        
        a -= 4;// esto es igual a = a - 4;
        System.out.println("-a = " + a);
        
        a *= 5;// esto es igual a = a * 5;
        System.out.println("*a = " + a);
        
        a /= 6;// esto es igual a = a / 6;
        System.out.println("/a = " + a);
    }
}
