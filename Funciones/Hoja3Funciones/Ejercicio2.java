import java.util.Scanner;

public class Ejercicio2 {

    // 1. Buscar carácter en una cadena
    // 2. Contar vocales en una cadena
    // 3. Salir - - - -
    // Si el usuario selecciona la opción 1:
    // o Se pide al usuario cadena y carácter y se invoca a una función
    // (buscaChar) que devuelva verdadero/falso dependiendo de si se
    // encuentra el carácter en la cadena o no.
    // o Se imprime el mensaje “Se ha encontrado el carácter buscado” o “No se
    // ha encontrado el carácter buscado” en función del resultado de la función
    // buscaChar.
    // o Se muestra de nuevo el menú de opciones
    // Si el usuario selecciona la opción 2:
    // o Se pide al usuario la cadena de entrada y se invoca a una función
    // (contarVocales) que devuelva el número de vocales.
    // o Se imprime el mensaje “La cadena tiene X vocales” donde X es el
    // resultado de la función contarVocales.
    // o Se muestra de nuevo el menú de opciones
    // Si el usuario selecciona la opcion 3, finaliza el programa
    // Utiliza una función (mostrarMenu()) que imprima las opciones en pantalla.

    public static void main(String[] args) {
        clearConsole();
        Initialize();

    }

    private static void Initialize() {
        Scanner scanner = new Scanner(System.in);

        switch (mostrarMenu(scanner)) {
            case 1 -> {
                // esta el caracter en la cadena?
                clearConsole();
                System.out.println("el resultado es :" + buscarChar(validarChar(scanner), introduceCadena(scanner)));
                Initialize();
            }
            case 2 -> {

                // contar vocales
                clearConsole();
                System.out.println("el resultado de contar vocales es: " + contarVocales(introduceCadena(scanner)));
                Initialize();

            }
            case 3 -> {
                scanner.close();
                System.exit(0);
            }
            default -> {
                System.out.println("Que opcion es esa?");
                Initialize();

            }

        }
    }

    // funcion de mostrar menu
    static int mostrarMenu(Scanner scanner) {
        int opcion = -1;
        do {
            System.out.println("Selecciona una opcion del menu");
            System.out.println("1.Buscar carácter en una cadena ");
            System.out.println("2.Contar vocales en una cadena ");
            System.out.println("3.Salir");
            if (!scanner.hasNextInt()) {
                System.out.println("Selecciona un numero, de opción");
                clearConsole();
                scanner.next();
            } else {
                opcion = scanner.nextInt();
            }

        } while (opcion < 0);

        return opcion;

    }

    // valido si lo que he introducido es un char
    public static char validarChar(Scanner scanner) {
        String temp;
        char resultado;
        while (true) {
            System.out.println("introduce un character: ");
            temp = scanner.next();
            if (temp.length() != 1) {
                clearConsole();
                System.out.println("un caracter es solo un caracter");
            } else {
                resultado = temp.charAt(0);
                break;
            }

        }

        return resultado;
    }

    // introduczco una cadena
    static String introduceCadena(Scanner scanner) {
        scanner.nextLine();
        System.out.println("introduce cadena");
        String string = scanner.nextLine();
        return string;
    }

    // busco un char2
    static boolean buscarChar(char character, String cadena) {
        cadena = cadena.toLowerCase();
        System.out.println(cadena);
        boolean resultado = false;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == character) {
                resultado = true;
                break;
            }

        }
        return resultado;
    }

    // cuento vocales
    static int contarVocales(String cadena) {
        int count = 0;
        cadena = cadena.toLowerCase();
        System.out.println(cadena);
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i'
                    || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void clearConsole() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

}
