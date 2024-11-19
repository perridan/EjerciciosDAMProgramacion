import java.util.Scanner;

class Ejercicio1B {
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

   // Bucle asigna las tablas de multiplicar
   static void bucle(int numero) {
      int iterador = numero;
      while (iterador <= 10) {
         System.out.println("tabla del :" + iterador);

         int iterador2 = 0;
         // realiza las operaciones de cada tabla
         while (iterador2 <= 10 + 1) {
            System.out.println(iterador + " X " + iterador2 + " = " + ((int) (iterador * iterador2)));
            iterador2++;
         }
         iterador++;
      }
   }

}