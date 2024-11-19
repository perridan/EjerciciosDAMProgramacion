import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // vamos a pedir al usuario los datos
        int num1 = (int) (Math.random() * 99);
        int num2 = (int) (Math.random() * 99);

        System.out.println("Te voy a dar 2 numeros el " + num1 + " y el " + num2);

        int operacion = (int) (Math.random() * 4);
        // chapuza para que si alguno de los numeros son 0, no salga división

        if (num1 == 0 || num2 == 0 && operacion == 3) {
            operacion = (int) (Math.random() * 3);
        }
        // Seleccionamos la operación
        int resultado = switch (operacion) {
            case 0 -> {
                System.out.println("vamos a sumar");
                yield num1 + num2;
            }
            case 1 -> {
                System.out.println("vamos a restar");
                yield num1 - num2;
            }
            case 2 -> {
                System.out.println("vamos a multiplicar");
                yield num1 * num2;
            }
            case 3 -> {
                System.out.println("vamos a dividir");
                yield num1 / num2;
            }
            default -> {
                System.out.println("Vamos a sumarr");
                yield num1 + num2;
            }
        };
        // Comprobamos la respuesta del jugador
        System.out.print("Introduce un numero: ");
        float numero = scanner.nextFloat();
        if (resultado == numero) {
            System.out.println("acertaste");
        } else {
            System.out.println("fallaste");

        }

        scanner.close();
    }

}
