import java.util.Scanner;

class Ejercicio4 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("introduce un numero entero");
      int numero = scanner.nextInt();

      for (int i = 1; i < numero + 1; i++) {
         // si el modulo de la division es distinto de 0 es impar.
         if (i % 2 != 0) {
            System.out.println(i);

         }

      }

   }

}