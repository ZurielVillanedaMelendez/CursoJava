
public class InferenciasTipos {
    public static void main(String args[]){
        
        var miVariableEntera = 10;
        System.out.println(miVariableEntera);
        
        var miVariableCadena = "Hola mi pana";
        System.out.println(miVariableCadena);
        
        // Reglas para declarar variables
        //Permitido
        var miVariable = 1; // Por conveniencia se debe empezar con mayuscula
        System.out.println(miVariable);
        var _miVariable = 2;
        System.out.println(_miVariable);
        var $miVariable = 3;
        System.out.println($miVariable);
        // Se permite pero no se recomienda 
        var ámiVariable = 4;
        System.out.println(ámiVariable);
        // Cualquier otro caracter especial no esta permitido
        // var #miVariable = 5; esto es un error
        
    }
}
