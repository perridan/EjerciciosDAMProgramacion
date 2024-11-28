
import java.util.Scanner;
import rechautils.Validators;

public class Calculadora {

    public Calculadora() {

    }


    double suma(double num1, double num2) {
        double operacion;
        operacion = num1 + num2;
        System.out.println("el resultado de la operación de " + num1 + " y " + num2 + " es: " + operacion);
        return operacion;

    }

    double resta(double num1, double num2) {

        double operacion;
        operacion = num1 - num2;
        System.out.println("el resultado de la operación de " + num1 + " y " + num2 + " es: " + operacion);
        return operacion;

    }

    double multplicacion(double num1, double num2) {
        double operacion;
        operacion = num1 * num2;
        System.out.println("el resultado de la operación de " + num1 + " y " + num2 + " es: " + operacion);
        return operacion;

    }

    double division(double num1, double num2) {
        double operacion = 0;
        if (num2 == 0) {
            System.out.println("Error el divisor no puede ser 0");
        } else {
            operacion = num1 / num2;
        }
        System.out.println("el resultado de la operación de " + num1 + " y " + num2 + " es: " + operacion);
        return operacion;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce numero 1");
        double num1 = Validators.doubleValidados(scanner);
        System.out.println("introduce numero 2");
        double num2 = Validators.doubleValidados(scanner);
        Calculadora calculadora = new Calculadora();
        calculadora.suma(num1, num2);
        calculadora.resta(num1, num2);
        calculadora.multplicacion(num1, num2);
        calculadora.division(num1, num2);
    }

}
