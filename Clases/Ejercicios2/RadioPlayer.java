import java.util.Scanner;

public class RadioPlayer {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Radio sintonizador = new Radio();

        System.out.println("Bienvenido al Sintonizador FM.");
        System.out.println("Instrucciones:");
        System.out.println(" - Presione 'u' para subir la frecuencia.");
        System.out.println(" - Presione 'd' para bajar la frecuencia.");
        System.out.println(" - Presione 's' para salir.");

        char opcion;
        do {
            System.out.print("Seleccione una opción: ");
            opcion = scanner.next().toLowerCase().charAt(0); // Leer la opción del usuario

            switch (opcion) {
                case 'u' -> {
                    sintonizador.upDial();
                    sintonizador.mostrarDisplay();
                }
                case 'd' -> {
                    sintonizador.downDial();
                    sintonizador.mostrarDisplay();
                }
                case 's' -> System.out.println("Saliendo del Sintonizador FM. ¡Hasta luego!");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 's');

        scanner.close();
    }
}

