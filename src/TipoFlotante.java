
public class TipoFlotante {

    public static void main(String args[]) {
        //Tipo primitivos flotantes: Float(32 bits) y Double(64 bits)

        /*Dos maneras de declarar tipo float ya que por defecto los numeros
        decimale se usan double*/
        //Manera 1(Se puede poner la "F" mayuscula y minuscula)
        float numeroFloat = 10.16125814F;
        System.out.println("numeroFloat = " + numeroFloat);
        //Manera 2
        float nujmeroFloat = (float) 11.3578951;
        System.out.println("nujmeroFloat = " + nujmeroFloat);

        //Maximos y Minimos de float
        System.out.println("El numero maximo de float es: " + Float.MAX_VALUE);
        System.out.println("El numero minimo de float es: " + Float.MIN_VALUE);
        
        double numeroDouble = 1000000000.5251256216;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("El numero maximo de double es: " + Double.MAX_VALUE);
        System.out.println("El numero minimo de double es: " + Double.MIN_VALUE);
        
    }
}
