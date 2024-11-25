public class Persona {
    String nombre;
    int edad;
    double estatura;

    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;

    }

    void saludar() {
        System.out.println("Hola mi nombre es " + nombre);
        System.out.println("Tengo " + edad + " años y mido " + estatura);
    }

    void cumplirAnyos() {
        edad++;
        System.out.println("CUMPLEAÑOS FEEEELIIIZZ!!!");
        System.out.println("CUMPLEAÑOS FEEEELIIIZZ!!!");
        System.out.println("TE DESAMOS TODOS!!!");
        System.out.println("CUMPLEAÑOS FEEEELIIIZZ!!!");
    }

    void crecer(double incremento) {
        estatura = estatura + incremento;
    }

    public static void main(String[] args) {
        // creamos el objeto persona
        Persona persona = new Persona("Pepe", 18, 1.7);
        // invocamos al metodo saludar.
        persona.saludar();
        persona.cumplirAnyos();
        persona.crecer(0.02);
        persona.saludar();
    }

}
