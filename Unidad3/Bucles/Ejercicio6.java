import java.util.Scanner;

class Ejercicio6 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // vamos a hacer un bucle del 1 al 100
      double resultado = 0;
      for (int i = 0; i <= 10; i++) {

         System.out.println("introduce un numero entero");
         int numero = sc.nextInt();
         resultado = (resultado == 0) ? numero : resultado * numero;

      }
      System.out.println("el resultado de la operacioón de multiplicacion loca es: " + resultado);
   }

}