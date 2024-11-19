import java.util.Scanner;

class Ejercicio10 {
   public static void main(String[] args) {
      //Iniciamos Scanner
      Scanner sc = new Scanner(System.in);
      //iniciamos variables locales fuera del bucle para los calculos.
      double numero = 0;
      double numeroAnterior = 0;
      double resultado = 0;
      //avisamos al usuario como salir del bucle infinito.
      System.out.println("pulsa en cualquier momento control+c para salir");
      while (true) {
         System.out.println("introduce un numero");
         numero = sc.nextDouble();
         if (numero == numeroAnterior) {
            System.out.println("valor duplicado");
         } else {
            resultado += numero;
            numeroAnterior = numero;
            System.out.println("el resultado que llevamos es: " + resultado);
         }
      }

   }
}