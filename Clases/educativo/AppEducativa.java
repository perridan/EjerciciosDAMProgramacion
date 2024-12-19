package educativo;

public class AppEducativa {

    public static void main(String[] args) {
        ClearScreen.clear();
        Profesor profesor1 = new Profesor("Javier", "Ingenieria");
        profesor1.muestraInfo();

        Profesor profesor2 = new Profesor("Pedro", "Ingenieria");
        profesor2.muestraInfo();

        Curso curso1 = new Curso("Curso 1", "C1", profesor1, new Aula("Matematicas", 1, 10));
        Curso curso2 = new Curso("Curso 2", "C2", profesor2, new Aula("Biologia", 2, 10));
        Curso curso3 = new Curso("Curso 3", "C3", profesor2, new Aula("Biologia", 2, 10));

        curso1.asignarAula(new Aula("Matematicas", 1, 10));
        curso2.asignarAula(new Aula("Biologia", 2, 10));
        profesor2.muestraInfo();
        curso1.muestraInfo();
        curso2.muestraInfo();
        curso3.muestraInfo();


    }
}
