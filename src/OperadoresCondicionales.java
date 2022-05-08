
public class OperadoresCondicionales {
    
    public static void main(String args[]){
        
        var a = 8;
        var valorMaximo = 10;
        var valorMInimo = 0;
        
        //Usar and && tiene que ser verdadero las dos para cumplirse
        var resultado = a >= 0 && a <= 10;
        if(resultado){
            System.out.println("El resultado esta en el rango");
        }else{
            System.out.println("El valor esta fuera del rango");
        }
        
        if(a >= 0 && a <= 10){
            System.out.println("El resultado esta en el rango");
        }else{
            System.out.println("El valor esta fuera del rango");
        }
        //Usar or || es verdadero con que una condicion lo sea
        var vacaciones = false;
        var diasDescanso = false;
        
        if(vacaciones || diasDescanso){
            System.out.println("Puede ir");
        }else{
            System.out.println("NO puede ir");
        }
    }
}
