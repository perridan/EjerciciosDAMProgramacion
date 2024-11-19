import java.util.Scanner;

public class Ejercicio1 {

    // 1. Diseña un programa que presente un menú con las siguientes opciones:
    // 1. Sumar dos números
    // 2. Restar dos números
    // 3. Multiplicar dos números
    // 4. Dividir dos números
    // 5. Salir - - -
    // Para realizar la operación seleccionada por el usuario, se utiliza una
    // función
    // calculadora que tiene como parámetros de entrada los dos números y la
    // operación.
    // Utiliza una función mostrarMenu que imprima las opciones por pantalla.
    // Cuando el usuario seleccione la opción 5, se sale del programa

    public static void main(String[] args) {
        Initialize();

    }

    private static void Initialize() {
        Scanner scanner = new Scanner(System.in);
        validarMenu(scanner);
    }

    static int validarMenu(Scanner scanner) {
        int opcion = -1;
        do {

            System.out.println("Selecciona una opcion del menu");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Multiplicar dos números");
            System.out.println("4. Dividir dos números");
            System.out.println("Salir");
            if (!scanner.hasNextInt()) {
                System.out.println("Selecciona un numero, de opción");
                scanner.next();
            } else {
                opcion = scanner.nextInt();
            }

        } while (opcion < 0);
        if (opcion >= 1 || opcion <= 4) {
            System.out.println("introduce 2 numeros");
            double num1 = doubleValidados(scanner);
            System.out.println("introduce 2 numeros");
            double num2 = doubleValidados(scanner);
            calculoMenu(opcion, num1, num2);

        } else {
            scanner.close();
            System.exit(0);
        }
        return opcion;

    }

    static void calculoMenu(int option, double num1, double num2) {
        double resultado = switch (option) {
            case 1 -> {
                yield num1 + num2;
            }
            case 2 -> {
                yield num1 - num2;
            }
            case 3 -> {
                yield num1 * num2;
            }
            case 4 -> {
                if (num2 == 0) {
                    System.out.println("Division no puede dividirse por 0");
                    Initialize();
                }
                yield num1 / num2;
            }
            default -> {
                yield 0;
            }

        };
        System.out.println("el resultado de la operación es: " + resultado);
        Initialize();
    }

    static double doubleValidados(Scanner scanner) {
        double resultado = 0.0;

        while (true) {
            if (!scanner.hasNextDouble()) {
                System.out.println("introduce un double correcto");
                scanner.next();

            } else {
                resultado = scanner.nextDouble();
                break;
            }
        }
        return resultado;

    }
}
