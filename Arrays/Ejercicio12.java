import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ciudades = { "madrid", "paris", "londres", "tokio", "california" };
        Arrays.sort(ciudades);

        while (true) {
            System.out.println("introduce el nombre de una ciudad, o \"salir\" para cerrar");
            String entrada = scanner.next().toLowerCase();
            if (entrada.equals("salir") || entrada.equals("exit")) {
                System.out.println("Hasta luego");
                scanner.close();
                System.exit(0);
            } else {

                int position = Arrays.binarySearch(ciudades, entrada);
                if (position < 0) {
                    System.out.println("ciudad no encontrada");
                } else {
                    System.out.printf("la ciudad encontrada es %s y esta en la posicion %d \n", ciudades[position],
                            position);
                }

            }

        }

    }
}
