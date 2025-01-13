import java.util.Scanner;
import rechautils.Validators;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNum = 0;
        int[] enteros = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("introuce 4 números enteros");
            enteros[i] = Validators.intValidado(scanner);

        }

        System.out.println("el numero maximo es " + maxValue(enteros));
    
    }

    public static int maxValue(int[] enteros) {
        int maxNumber = 0;

        for (int i = 0; i < enteros.length; i++) {

            if (i == 0) {
                maxNumber = enteros[i];

            } else {
                maxNumber = Math.max(enteros[i - 1], enteros[i]);
            }
        }
        return maxNumber;
    }

}
