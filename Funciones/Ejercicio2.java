import java.util.Scanner;

public class Ejercicio2 {

    static double operacion(double num1, double num2, String operacion) {
        double resultadoOperacion = 0;
        switch (operacion) {
            case "+" -> {
                resultadoOperacion = num1 + num2;

            }
            case "-" -> {
                resultadoOperacion = num1 - num2;

            }
            case "*" -> {
                resultadoOperacion = num1 - num2;

            }
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("error, la division no puede ser divisible por 0");

                } else {
                    resultadoOperacion = num1 - num2;
                }

            }

            default -> {
                System.out.println("No se reconoce la operacion");
            }

        }

        return resultadoOperacion;
    }

    public static void main(String[] args) {
        
        inicio();
    }

    static void inicio() {
        // initializo el scanner
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        String operador;

        System.out.println("vamos a calcular 2 numeros introduce el primer numero");
        num1 = scanner.nextInt();
        System.out.println("que operacion vamos a hacer?");
        operador = scanner.next();
        System.out.println("numero introduce el segundo numero");
        num2 = scanner.nextInt();
        // invoco al metodo que me devuelve un double
        double resultado = operacion(num1, num2, operador);
        System.out.println("el resultado de la operacion es " + resultado);
        System.out.println("hacemos otra?");
        String pregunta=scanner.next();

        if (pregunta.equalsIgnoreCase("si")|| pregunta.equalsIgnoreCase("yes"))
        {
            inicio();
        }
        else
        {
            scanner.close();
        }
    }
}
