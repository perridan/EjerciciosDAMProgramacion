package educativo;

public class Profesor {

    public String nombre;
    public String especialidad;
    private int cursosAsignados;

    public Profesor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursosAsignados = 0;
    }

    public void incrementarCursosAsignados() {
        cursosAsignados++;
    }

    public void muestraInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cursos asignados: " + cursosAsignados);
        System.out.println("");
    }

}
