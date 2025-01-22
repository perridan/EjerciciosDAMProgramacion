import static java.lang.Math.floor;
import java.util.Arrays;
import java.util.Scanner;
import rechautils.Validators;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos numeros introduciremos?");
        int longitud = Validators.intValidado(scanner);
        System.out.println("cual sera el valor maximo?");
        int valorMax = Validators.intValidado(scanner);
        System.out.println("array generado con solo pares " + Arrays.toString(rellenaPares(longitud, valorMax)));

    }

    static int[] rellenaPares(int longitud, int fin) {

        if (fin <= longitud * ( longitud - 1) / 2 ){
            System.out.println("si seguimos adelante provocaras un bucle infinito así que me paro");
            throw new IllegalArgumentException("No se encontraran numeros aleatorios");
        }
    
        int pares[] = new int[longitud];
        int posicion = 0;
        while (posicion < pares.length) {
            int randomNumber = (int) floor(Math.random() * fin + 1);
            if (!estaDuplicado(pares, posicion, randomNumber) && randomNumber % 2 == 0) {
                pares[posicion] = randomNumber;
                posicion++;
            } else {
                if (posicion <= 0) {

                } else if (posicion > 0) {
                    posicion--;
                }

            }

        }
        Arrays.sort(pares);
        return pares;
    }

    static boolean estaDuplicado(int[] pares, int position, int randomNum) {
        for (int i = 0; i < position; i++) {
            if (pares[i] == randomNum) {
                System.out.printf("duplicado position %d \n", position);
                return true;
            }
        }
        return false;
    }
}
