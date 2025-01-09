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

    // Sobrecarga que limita si esta en un rango determinado
    public static double doubleValidados(Scanner scanner, double min, double max) {
        double resultado = 0.0;

        while (true) {
            if (!scanner.hasNextDouble()) {
                System.out.println("introduce un double correcto");
                scanner.next();

            } else {
                resultado = scanner.nextDouble();
                if (isInRange(resultado, min, max)) {
                    break;

                } else {
                    System.out.println("no esta en rango");
                }
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

    // version que el numero este en un rango determinado.
    public static int intValidado(Scanner scanner, int min, int max) {
        int resultado = 0;

        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("introduce un int correcto");
                scanner.next();

            } else {
                resultado = scanner.nextInt();
                if (isInRangeInt(resultado, min, max)) {
                    break;
                } else {
                    System.out.println("el numero no esta en rango");
                }

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
    public static char validarChar(Scanner scanner) {
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

    // public static String validaString(Scanner scanner)
    // {
    // scanner.hasnext
    // String string = "0";
    // return string;

    // }

    // Esta en rango
    public static boolean isInRange(double number, double min, double max) {
        boolean result;
        result = !(number < min || number > max);
        return result;
    }

    public static boolean isInRangeInt(int number, int min, int max) {
        boolean result;
        result = !(number < min || number > max);
        return result;
    }
}