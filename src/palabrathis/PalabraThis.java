
package palabrathis;

public class PalabraThis {

    public static void main(String[] args) {
        Persona persona = new Persona("Zuriel", "Villaneda");
        System.out.println(persona);
        System.out.println("persona = " + persona.nombre);
        System.out.println("persona = " + persona.apellido);
        new Imprimir().imprimir(persona);
    }
}
    class Persona {

        String nombre, apellido;

        Persona(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
            System.out.println("this = " + this);
        }
    }

    class Imprimir {

        public void imprimir(Persona persona) {
            System.out.println("persona = " + persona);
            System.out.println("this = " + this);
        }
    }
