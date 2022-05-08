
public class OperadoresUnarios {

    public static void main(String args[]) {
        //Para cambiar el signo a una variable 
        int a = 37;
        int b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // esta es negacion !
        boolean c = false;
        boolean d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        //Incrimento 
        
        //preincremento
        //Se incrementa antes de leer la variable
        int e = 3;
        int f = ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        //postincremento
        //Se inprime y luego se incrementa
        int g = 5;
        int h = g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //Decremento
        
        //predecremento
        //se decrementa antes de imprimir 
        int i = 7;
        int j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //postdecremento
        //se imprime y luego se actualiza 
        int k = 8;
        int l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}
