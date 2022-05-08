
public class OperadoresAritmetricos {
    public static void main(String args[]){
        int a=3, b=2;
        int resultado;
        
        resultado = a + b;
        System.out.println("resultado = " + resultado);
        
        resultado = a - b;
        System.out.println("resultado = " + resultado);
        
        resultado = a * b;
        System.out.println("resultado = " + resultado);
        
        resultado = a / b;
        System.out.println("resultado = " + resultado);
        
        var resulatdo2 = 3D / b;
        System.out.println("resulatdo2 = " + resulatdo2);
        
        if(a % 2 == 0)
            System.out.println("El numero es par");
        else
            System.out.println("El numero no es par");
        
        if(b % 2 == 0)
            System.out.println("El numero es par");
        else
            System.out.println("El numero no es par");
            
    }
}

