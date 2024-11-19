import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // vamos a pedir al usuario los datos
        System.out.print("escribe un numero entre el 0 y el 99: ");
        int numero = scanner.nextInt();

        String[] unidades = { "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };
        String[] especiales = { "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete",
                "dieciocho", "diecinueve" };
        String[] decenas = { "", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta",
                "noventa" };

        if (numero >= 1 && numero <= 9) {
            System.out.println("el numero es " + unidades[numero]);
        } else if (numero >= 10 && numero <= 19) {

            System.out.println("el numero es " + especiales[numero - 10]);
        } else if (numero >= 20 && numero <= 99) {
            int decena = numero / 10;
            int unidad = numero % 10;
            System.out.println("el numero es " + decenas[decena] + " y " + unidades[unidad]);
        } else if (numero == 0) {
            System.out.println("el numero es cero");
        } else {
            System.out.println("fuera de rango");
        }
    }

}
