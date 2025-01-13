import java.util.Scanner;
import rechautils.Validators;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNum = 0;
        System.out.println("Cuantos numeros introduciremos?");
        int nNumeros = Validators.intValidado(scanner);
        int[] enteros = new int[nNumeros];

        for (int i = 0; i < enteros.length; i++) {
            System.out.printf("introuce %d números enteros, este es el %d ", enteros.length, i);
            enteros[i] = Validators.intValidado(scanner);

        }

        calulos(enteros);
    }

    public static void calulos(int[] enteros) {
        int maxNumber = 0;
        int sumaPositivo = 0;
        int nPos = 0;
        int nNeg = 0;
        int sumaNegativo = 0;
        int nCeros = 0;

        for (int i = 0; i < enteros.length; i++) {

            if (enteros[i] < 0) {
                // numero es negativo
                sumaNegativo += enteros[i];
                nNeg++;

            } else if (enteros[i] > 0) {
                // numero positivo
                sumaPositivo += enteros[i];
                nPos++;

            } else if (enteros[i] == 0) {
                // cero
                nCeros++;
            }

        }
        double promedioPos = (nPos ==0?0:sumaPositivo / nPos);
        double promedioNeg = (nNeg==0?0:sumaNegativo / nNeg);
        System.out.printf(
                "el usuario ha introducido los siguientes valores: Media Positivos %f, Media Negativos %f, y veces con cero %d ",
                promedioPos, promedioNeg, nCeros);
    }

}
