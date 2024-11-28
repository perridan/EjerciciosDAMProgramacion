import java.util.Scanner;
import rechautils.Validators;
public class Estudiante {
    double nota1;
    double nota2;
    double nota3;

    public Estudiante(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public Estudiante(double nota1, double nota2) {
        this(nota1, nota2, 5.0);
    }

    public double promedio() {
        double resultado;
        resultado = (nota1 + nota2 + nota3) / 3;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce nota 1");
        double nota1 = Validators.doubleValidados(scanner,0,10);
        System.out.println("introduce nota 2");
        double nota2 = Validators.doubleValidados(scanner,0,10);
        Estudiante estudiante = new Estudiante(nota1, nota2);
        System.out.printf("el promedio del esutudiante es %f ", estudiante.promedio());

    }

}
