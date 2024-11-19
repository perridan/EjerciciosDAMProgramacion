import java.util.Scanner;

public class Ejercicio3 {

    // Crea un programa que solicite números positivos al usuario hasta que el
    // usuario
    // introduzca el valor -99.
    // Cuando el usuario introduce un número:
    // o Se valida si es negativo/positivo con una función validaDato que devuelve
    // verdadero si OK, falso en caso contrario. Debe reconocer el valor -99 como
    // correcto.
    // o Si el dato es incorrecto se imprime mensaje describiendo el motivo de error
    // y
    // se solicita el siguiente número.
    // o Si el dato es correcto:
    // o Si el número es par : se incrementa en 1 un contador de números
    // pares
    // o Si el número es impar: se incrementa en 1 un contador de números
    // impares.
    // o Se solicita el siguiente número
    // o Antes de salir (-99) se imprime el contador de números pares y el contador
    // de números impares. .

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }

    static int validaPositivos(Scanner scanner) {
        int resultado = 0;
        while (true) {
            System.out.println("introduce un numero entero: ");
            if (!scanner.hasNextInt()) {
                scanner.next();
            }
            else
            {
               resultado = scanner.nextInt();
               break;
            }

        }
       return resultado;

    }

}
