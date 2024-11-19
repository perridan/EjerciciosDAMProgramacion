import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el ángulo en grados: ");
        double grados = scanner.nextDouble();

        // Ajustar el ángulo al rango de 0° a 360° utilizando el operador módulo
        grados = grados % 360;
        if (grados < 0) {
            grados += 360; // Asegura que el ángulo no sea negativo
        }

        // Convertir el ángulo de grados a radianes
        double radianes = Math.toRadians(grados);

        System.out.println("El ángulo en grados ajustado es: " + grados + "°");
        System.out.println("El equivalente en radianes es: " + radianes + " radianes");


        scanner.close();
}
        
}
