
package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Zuriel", "Villaneda");
        System.out.print(persona);
        System.out.println("persona = " + persona.nombre);
        System.out.println("persona = " + persona.apellido);
    }
    
}
class Persona{
    String nombre, apellido;
    Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}