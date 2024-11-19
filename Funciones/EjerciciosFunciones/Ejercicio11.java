import java.util.Scanner;
/* Escribe un programa que busque en una cadena de texto dada por el usuario un 
determinado carácter. Se solicita al usuario la cadena de texto y el carácter a buscar. 
Utiliza una función que tenga como parámetro cadena y carácter a buscar y 
devuelva ‘verdadero’ si se ha localizado el carácter. Falso en caso contrario. 
Desde el programa principal se imprimirá como resultado el mensaje “El carácter X 
se encuentra en la cadena ZZZZ” 
Siendo X y ZZZZ los datos de entrada*/

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce la cadena de caracteres");
        String cadena = scanner.nextLine();
        System.out.println("introduce caracter a buscar");
        char caracter;
        while (true) {
            String chaString = scanner.nextLine();
            if (chaString.length() > 1) {
                System.out.println("por favor introduce un solo caracter");
            } else {
                caracter =  chaString.charAt(0);
                break;

            }
        }
        String resultado = contieneCaracter(cadena, caracter)? "El caracter "+caracter+" se encuentra en la cadena":"El caracter "+ caracter+ " no se encuentra en la cadena";
        System.out.println(resultado);

    }

    // funcion que calcula la potencia
    public static boolean contieneCaracter(String cadena, char character) {

        boolean contador = false ;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)==character)
            {
                contador=true;
                System.out.println("la primera ocurrencia del caracter está en: " + i);
                break;
            }

        }

        return contador;

    }

}
