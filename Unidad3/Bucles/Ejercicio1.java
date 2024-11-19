import java.util.Scanner;

class Ejercicio1 {
   public static void main(String[] args) {

      numero();

   }

   static void numero() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("introduce un numero entre el 0 y el 10");
      int numero = scanner.nextInt();
      if (numero > 0 && numero <= 10) {
         bucle(numero);
      } else {
         System.out.println("numero no valido");
         numero();
      }
      scanner.close();
      // realizamos el bucle
   }

   static void bucle(int numero) {
      int iterador = 0;

      while (iterador <= 10) {
         System.out.println(numero + " X" + iterador + "=" + ((int) (numero * iterador)));
         iterador++;
      }
   }

}