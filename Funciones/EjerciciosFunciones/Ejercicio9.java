
import java.util.Scanner;

/*  Escribe un programa que cuente las vocales en una cadena de texto introducida por 
el usuario. Utiliza una función que tenga como parámetro una cadena de texto y 
devuelva un entero. 
Ver métodos length y charAt de la clase String.*/

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce la cadena de caracteres");
        String cadena = scanner.nextLine();
        System.out.println("tenemos :" + cuentaVocales(cadena) + " vocales");
scanner.close();
    }

    // funcion que calcula la potencia
    public static int cuentaVocales(String cadena) {

        int contador = 0;
        cadena = cadena.toLowerCase();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o'
                    || cadena.charAt(i) == 'u') {
                contador++;
            }

        }

        return contador;

    }

}
