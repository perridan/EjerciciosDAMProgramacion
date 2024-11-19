import java.util.Scanner;

public class Ejercicio1 {
    // Moodelo 1 - Polideportivo

    public static void main(String[] arrs) {
        Scanner scanner = new Scanner(System.in);
        // defino variable resultado
        int resultado = 0;
        // introducimos la edad de los integrantes
        System.out.println("introduce la edad de los integrantes:");
        int edadIntegrantes = scanner.nextInt();
        // comprobamos si la edad es negativa
        if (edadIntegrantes < 0) {
            System.out.println("la edad no puede ser negativa");
            scanner.close();
            return;
        }
        // comprobamos si el numero de integrantes es negativo.
        System.out.println("cuantos integrantes son? ");
        int numeroDeIntegrantes = scanner.nextInt();

        // realizamos la comprobación
        if (numeroDeIntegrantes < 0) {
            System.out.println("no puede haber 0 integrantes");
            scanner.close();
            return;
        }
        // niños
        if (edadIntegrantes >= 0 && edadIntegrantes <= 12) {
            resultado = numeroDeIntegrantes * 25;
            System.out.println("Se aplica el precio de niños para " + numeroDeIntegrantes + " total: " + resultado);
        }
        // adolescentes
        else if (edadIntegrantes >= 13 && edadIntegrantes <= 17) {
            resultado = numeroDeIntegrantes * 40;
            System.out
                    .println(
                            "Se aplica el precio de adolescentes para " + numeroDeIntegrantes + " total: " + resultado);
        }
        // Adultos
        else if (edadIntegrantes >= 18 && edadIntegrantes <= 64) {
            resultado = numeroDeIntegrantes * 50;
            System.out.println("Se aplica el precio de adultos para " + numeroDeIntegrantes + " total: " + resultado);
        } // Tercera edad
        else if (edadIntegrantes >= 65) {
            resultado = numeroDeIntegrantes * 30;
            System.out
                    .println("Se aplica el precio de tercera edad para " + numeroDeIntegrantes + " total: " + resultado
                            + " e");
        }
        scanner.close();
    }
}
