import java.util.Arrays;
import java.util.Scanner;
import rechautils.Validators;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cuantos números enteros quieres introducir?");
        int nNumeros = 0;
        nNumeros = Validators.intValidado(scanner);
        int[] enteros = new int[nNumeros];

        for (int i = enteros.length - 1; i >= 0; i--) {
            System.out.println("introuce 5 números decimales ");
            enteros[i] = Validators.intValidado(scanner);

        }
        System.out.println("los números que has introducido son " + Arrays.toString(enteros));
    }

}
