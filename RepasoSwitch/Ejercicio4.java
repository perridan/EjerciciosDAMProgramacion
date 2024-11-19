import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultado = 0;

        System.out.println("introduce un numero");
        double num1 = scanner.nextInt();
        System.out.println("introduce el segundo numero");
        double num2 = scanner.nextInt();

        System.out.println("introduce el Operador");
        String operador = scanner.next();

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("error division por 0");
                    break;
                }
                break;
            default:
                System.out.println("operacion erronea.");
                break;
            
        }
        System.out.println("el resultado de la operación es "+ resultado);

    }
}
