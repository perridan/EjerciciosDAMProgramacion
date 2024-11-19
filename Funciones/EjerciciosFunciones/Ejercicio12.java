import java.util.Scanner;
/* Escribe un programa que busque en una cadena de texto dada por el usuario un 
determinado carácter. Se solicita al usuario la cadena de texto y el carácter a buscar. 
Utiliza una función que tenga como parámetro cadena y carácter a buscar y 
devuelva ‘verdadero’ si se ha localizado el carácter. Falso en caso contrario. 
Desde el programa principal se imprimirá como resultado el mensaje “El carácter X 
se encuentra en la cadena ZZZZ” 
Siendo X y ZZZZ los datos de entrada*/

public class Ejercicio12 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce la cadena de caracteres");
        String cadena = scanner.nextLine();

       System.out.println(invertirCadena(cadena));

    }



    // funcion que calcula la potencia
    public static String invertirCadena(String cadena) {

        String cadenaInvertida="";

        for (int i = cadena.length(); i > 0; i--) {
              cadenaInvertida += cadena.charAt(i-1);
        }

        return cadenaInvertida;

    }

}
