import java.util.Scanner;
/*  Escribe un programa que utilice una función sobrecargada para realizar operaciones 
aritméticas. 
a. Si se invoca con 2 parámetros (numéricos) devuelve la suma de ambos 
valores 
b. Si se invoca con 3 parámetros (2 numéricos y el tercero un operador 
aritmético: +, - , / o *) devuelve el resultado de la operación pasada como 
tercer parámetro.   */

public class Ejercicio6 {
    public static int errors = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cuantos numeros aletorios tenemos?");
        int randomNumbers = scanner.nextInt();
        System.out.println("valor minimo");
        int min = scanner.nextInt();
        System.out.println("valor maximo");
        int max = scanner.nextInt();
        random(randomNumbers, min, max);

    }

    static void random(int randomNumbers, int min, int max) {

        if (randomNumbers <= 0 || min <= 0 || max <= 0) {
            System.out.println("No pueden ser 0 o menor a 0");
            return;
        } else {
            System.out.println("Vamos a inventarnos numeritos");
            for (int i = 0; i < randomNumbers; i++) {
                int randomNumber = (int) (Math.random() * max);
                if (randomNumber < min) {
                    i--;
                    continue;
                }
                System.out.println(randomNumber);
            }

        }

    }
//incluye la sobrecarga del ejercicio 3
    static void random(int randomNumbers) {
        System.out.println("Vamos a inventarnos numeritos reales de 0-1");
        for (int i = 0; i < randomNumbers; i++) {
            double randomNumber = Math.random();
            System.out.println(randomNumber);

        }

    }
}


