import java.util.Scanner;
/*  Escribe un programa que utilice una función sobrecargada para realizar operaciones 
aritméticas. 
a. Si se invoca con 2 parámetros (numéricos) devuelve la suma de ambos 
valores 
b. Si se invoca con 3 parámetros (2 numéricos y el tercero un operador 
aritmético: +, - , / o *) devuelve el resultado de la operación pasada como 
tercer parámetro.   */

public class Ejercicio4 {
    public static int errors = 0;

    public static void main(String[] args) {
        inicio();
    }

    static void inicio() {
        // initializo el scanner
        Scanner scanner = new Scanner(System.in);
        double numero1 = 0;
        System.out.println("introduce un numero");
        numero1 = scanner.nextDouble();
        System.out.println("introduce otro numero");
        numero1 = scanner.nextDouble();
        System.out.println("Introduce operando, intro para suma");
        String operando;
        scanner.nextLine();
        operando = scanner.nextLine();
        double resultado;
        if (operando == "" || operando == " ") {
            resultado = calcular(numero1, numero1);
        } else {
            resultado = calcular(numero1, numero1, operando);
        }
        System.out.println("el resultado es: " + resultado);
    }

    static double calcular(double num1, double num2) {

        double resultado = num1 + num2;

        return resultado;
    }

    static double calcular(double num1, double num2, String operador) {
        double resultado = 0;
        switch (operador) {
            case "+":
                calcular(num1, num2);

                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("no se puede dividir por 0");
                    error();
                    return 0;
                } else {
                    resultado = num1 / num2;
                }
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "":
                calcular(num1, num2);
                break;
            case " ":
                calcular(num1, num2);
                break;

            default:
                System.out.println("no se reconoce operación");
                error();
                break;
        }

        return resultado;
    }

    static void error() {
        errors++;
        if (errors >= 2) {
            System.exit(0);
        }
    }

    // Función que suma las notas y calcula la media llamando a la función
    // calcularMedia

}
