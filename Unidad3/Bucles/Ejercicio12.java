import java.util.Scanner;

class Ejercicio11 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int edadMinima = Integer.MAX_VALUE; // Inicializamos con el valor máximo posible para enteros
      int edadMaxima = Integer.MIN_VALUE; // Inicializamos con el valor mínimo posible para enteros
      int edad;
      boolean seIngresoEdad = false; // Para verificar si se ingresó alguna edad válida

      while (true) {
         System.out.print("Introduce la edad del alumno (escribe -1 para terminar): ");
         edad = scanner.nextInt();

         // Condición para terminar la entrada de datos
         if (edad == -1) {
            break;
         }

         // Verificación de una edad válida
         if (edad >= 0) {
            seIngresoEdad = true;
            // Comparar y actualizar la edad mínima y máxima
            if (edad < edadMinima) {
               edadMinima = edad;
            }
            if (edad > edadMaxima) {
               edadMaxima = edad;
            }
         } else {
            System.out.println("Por favor, introduce una edad válida (un número positivo).");
         }
      }
      // Mostrar resultados si se ingresaron edades válidas
      if (seIngresoEdad) {
         System.out.println("La edad mínima es: " + edadMinima);
         System.out.println("La edad máxima es: " + edadMaxima);
      } else {
         System.out.println("No se ingresaron edades válidas.");
      }

   }
}