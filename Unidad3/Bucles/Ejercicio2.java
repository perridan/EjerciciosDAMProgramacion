import java.util.Scanner;

class Ejercicio2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("introduce el primer numero ");
    int numero = scanner.nextInt();
    System.out.println("introduce el segundo numero ");
    int numero2 = scanner.nextInt();
    int resultado = 0;
    for (int i = numero; i <= numero2; i++) {
      System.out.println(i + " + " + resultado + " = " + (resultado += numero));

    }
    System.out.println("el resultado de la suma es " + resultado);

  }

}