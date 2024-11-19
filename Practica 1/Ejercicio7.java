
import java.util.Scanner;

//Practica Daniel Recha 

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce el segundo número");
        int numero2 = scanner.nextInt();

        System.out.println("el número más grande es: " + Math.max(numero1, numero2));
        scanner.close();
    }

}