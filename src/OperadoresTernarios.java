
public class OperadoresTernarios {

    public static void main(String args[]) {

        var resultado = (1 > 2) ? "Verdadero" : "Falso";
        System.out.println("resultado = " + resultado);
        var resultado2 = (3 > 2) ? "Verdadero" : "Falso";
        System.out.println("resultado2 = " + resultado2);

        var numero = 8;
        var numero2 = 9;
        var resultado3 = (numero % 2 == 0) ? "Numero par" : "Numero impar";
        System.out.println("resultado3 = " + resultado3);
        var resultado4 = (numero2 % 2 == 0) ? "Numero par" : "Numero impar";
        System.out.println("resultado4 = " + resultado4);
    
    }
}
