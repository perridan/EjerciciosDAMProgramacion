import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // introducimos un numero
    System.out.println("Introduce un numero");
    int numero = scanner.nextInt();
    // vamos a calcular el algoritmo
    String resultado = (numero >= 9 && numero < 10) ? "A"
        : (numero >= 8 && numero < 9) ? "B"
            : (numero >= 7 && numero < 8) ? "C"
                : (numero >= 6 && numero < 7) ? "D" : (numero < 6) ? "F" : "Debe haber algun error";
    System.out.println(resultado);
    scanner.close();
  }
}
