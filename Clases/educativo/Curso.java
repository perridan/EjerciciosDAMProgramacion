package educativo;

public class Curso {

    private String nombre;
    private String codigo;
    private Profesor profesor;
    private Aula aula;

    public Curso(String nombre, String codigo, Profesor profesor, Aula aula) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.profesor = profesor;
        this.aula = aula;
        profesor.incrementarCursosAsignados();
    }

    public void asignarAula(Aula aula) {
        this.aula = aula;
    }

    public void asignarProfesor(Profesor profesor) {
        if (this.profesor == null) {
            {
                this.profesor = profesor;
                profesor.incrementarCursosAsignados();
            }
        }
    }

    public void muestraInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        profesor.muestraInfo();
        System.out.println("Aula: " + aula.nombre);
    }

}
