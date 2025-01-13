import static java.lang.Math.floor;
import java.util.Arrays;
import java.util.Scanner;
import rechautils.Validators;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos numeros introduciremos?");
        int longitud = Validators.intValidado(scanner);
        System.out.println("cual sera el valor maximo?");
        int valorMax = Validators.intValidado(scanner);
        System.out.println("array generado con solo pares "+ Arrays.toString(rellenaPares(longitud, valorMax)));

    }

    static int[] rellenaPares(int longitud, int fin) {

        int pares[] = new int[longitud];
        int posicion = 0;
        while (posicion < pares.length) {
            int randomNumber = (int) floor(Math.random() * fin + 1);
            if (randomNumber % 2 == 0) {
                pares[posicion]=randomNumber;
                posicion++;
            }

        }
        Arrays.sort(pares);
        return pares;
    }
}
