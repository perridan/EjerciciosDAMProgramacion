import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // vamos a pedir un número al usuario
        System.out.println("Escribe un número al usuario comprendido entre el 0 al 9999");
        short numero = scanner.nextShort();
        // vamos a hacer el algoritmo, invirtamos la cadena
        String numeroInvertido = new StringBuilder(String.valueOf(numero)).reverse().toString();
        String numeroNormal = String.valueOf(numero);
        System.out.println(" " + numeroInvertido + " " + numeroNormal);
        if (numero >= 0 && numero <= 9999) {
            if (numeroNormal.equals(numeroInvertido)) {
                System.out.println("Es capicua");
            } else {
                System.out.println("No es capicua");
            }
        } else {
            System.out.println("introduce un numero que este dentro del rango ");
            scanner.close();
            main(args);
        }
    }
}
