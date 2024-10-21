class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public String leerNombre(){
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.modificarNombre("Denis");

        System.out.println("iniciamos el metodo main");

        System.out.println("persona.nombre = " + persona.leerNombre());
        System.out.println("Antes de llamar al metodo test");
        test(persona);
        System.out.println("Despues de llamar al metodo test");
        System.out.println(persona.leerNombre());
        System.out.println("Finaliza el metodo main con los datos del arreglo modificados!");

    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el metodo test");
        persona.modificarNombre("Alexander");
        System.out.println("Finalizamos el metodo test");


    }
}
