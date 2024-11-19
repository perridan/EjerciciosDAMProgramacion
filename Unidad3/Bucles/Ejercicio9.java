import java.util.Scanner;

class Ejercicio9 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // declaros la variable String
      String palabra;
      // hacemos un bucle al menos una vez
      do {
         System.out.println("introduce una palabra en minusculas, yo te la haré grande, escribe \"fin\" para terminar");
         // solicitamos palabra al usuario
         palabra = sc.nextLine();
         // compruebo si hemos escrito la palabra en minuscula.
         if (!palabra.toLowerCase().equals(palabra)) {
            System.out.println("la palabra tiene que ser en minusculas");
         } else {
            // convertimos la palabra la MAYUSCULA y la imprimimos por consola
            System.out.println(palabra.toUpperCase());
            // si la palabra no es fin seguimos con el bucle
         }
      } while (!palabra.contains("fin"));
      
   }
}