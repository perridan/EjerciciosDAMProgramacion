package educativo;

public class Aula {

    public String nombre;
    int planta;
    private int ocupacion;

    public Aula(String nombre, int planta, int ocupacion) {
        this.nombre = nombre;
        this.planta = planta;
        this.ocupacion = ocupacion;
    }

    public void setocupacion(int ocupacion) {
        if (ocupacion > 0) {
            this.ocupacion = ocupacion;
        } else {
            System.out.println("No puedes poner una ocupacion negativa");
        }

    }

    public void mostrarinformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Planta: " + planta);
        System.out.println("Ocupacion: " + ocupacion);
    }

}
