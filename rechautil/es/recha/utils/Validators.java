package rechautils;

import java.util.Scanner;

public class Validators {

    // valida que solo puedas introducir un double
    public static double doubleValidados(Scanner scanner) {
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

    // valida que solo se pueda introducir int
    public static int intValidado(Scanner scanner) {
        int resultado = 0;

        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("introduce un int correcto");
                scanner.next();

            } else {
                resultado = scanner.nextInt();
                break;
            }
        }
        return resultado;

    }

    // valida que no se pueda a introducir numero negativo
    public static int noAceptarNegativosEnteros(Scanner scanner) {
        int resultado;
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("introduce un int correcto");
                scanner.next();

            } else {

                resultado = scanner.nextInt();
                if (resultado < 0) {
                    System.out.println("el numero es negativo");
                } else {
                    break;

                }
            }
        }

        return resultado;

    }

    // Valida que no se puedan aceptar negativos metodo double
    public static double noAceptarNegativosDecimales(Scanner scanner) {
        double resultado;
        while (true) {
            if (!scanner.hasNextDouble()) {
                System.out.println("introduce un double correcto");
                scanner.next();

            } else {

                resultado = scanner.nextDouble();
                if (resultado < 0) {
                    System.out.println("el numero es negativo");
                } else {
                    break;

                }
            }
        }

        return resultado;

    }

    // Valida que puedas introducir solo un char
    public static char validarChar(Scanner scanner, String string) {
        String temp;
        char resultado;
        while (true) {
            System.out.println("introduce un character: ");
            temp = scanner.next();
            if (temp.length() != 1) {
                System.out.println("un caracter es solo un caracter");
            } else {
                resultado = temp.charAt(0);
                break;
            }

        }

        return resultado;
    }
}