
public class Concatenacion {
    public static void main(String args[]){
        //Un metodo para concatenar
        var usuario = "Zuriel";
        //Se puede anexar el espacio en la variable para poder separarlas
        String titulo = "Ingeniero ";
        var union = titulo + usuario;
        System.out.println("union = " + union);
        
        //Metodo dos para concatenar
        var usuariom = "Eliezer";
        String titulom = "Rey gay";
        //En lugar de poner el espacion en la variable se pone cuando se unen
        var unionm = titulom +" "+ usuariom;
        System.out.println("union = " + unionm);
        
        int i = 3;
        var j = 4;
        //Suma de numeros
        System.out.println(i + j);
        //Se suman de izquierda a derecha
        System.out.println(i + j + usuario);
        //Contexto de cadenas
        System.out.println(usuario + i + j);
        //Prioridad de operaciones
        System.out.println(usuario + (i + j));
    }
}
