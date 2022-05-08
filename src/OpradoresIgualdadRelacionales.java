
public class OpradoresIgualdadRelacionales {
    
    public static void main(String args[]){
        
        // == es de igualdad para comprobar dos valores
        var a = 3;
        var b = 2;
        var z = 3;
        var c = (a == b);
        System.out.println("c = " + c);
        
        var d = (a != b);
        System.out.println("d = " + d);
        
        var s = (a != z);
        System.out.println("s = " + s);
        
        
        var cadena = "Hola";
        var cadena2 = "Adios";
        var cadena3 = "Hola";
        var e = cadena == cadena2;//Compara referencia de objetos
        var h = cadena3 == cadena2;//Compara referencia de objetos
        System.out.println("e = " + e);
        System.out.println("h = " + h);
        
        //metodo para poder evaluar si la cadena es igual de manera correcta
        var f = cadena.equals(cadena2);
        System.out.println("f = " + f);
        
        var g = cadena.equals(cadena3);
        System.out.println("g = " + g);
        
        
    
    }
}
