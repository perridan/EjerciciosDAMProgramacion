import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // introducimos un numero
        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();
        // vamos a calcular el algoritmo
        String resultado = (numero % 3 == 0 && numero % 7 == 0) ? "El numero " + numero + " es multiplo de 3 y 7 "
                : (numero % 3 == 0) ? "el numero " + numero + " Es multiplo de 3"
                        : (numero % 7 == 0) ? "el numero " + numero + " es multiplo de 7"
                                : "el numero " + numero + " No es ni multiplo de 3 ni de 7";
        System.out.println(resultado);
        scanner.close();
    }
}
