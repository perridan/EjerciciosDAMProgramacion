import java.util.Scanner;

class Ejercicio8 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("introduce un numero entero");
      //pregunto al usuario cuantos numeros va a tener la media.
      int numeroLoops = sc.nextInt();
      //creo la variable de resultado y la initiazo a 0
      double resultado = 0;
//hago el bucle
      for (int i = 0; i <= numeroLoops; i++) {

         System.out.println("introduce un numero");
         double numero = sc.nextDouble();
         resultado += numero;

      }
      //hago el calculo 
      resultado = (double) (resultado / numeroLoops);
      //lo muestro por consola
      System.out.println("La media de la operacion es: " + resultado);
   }

}