import java.util.Scanner;

class Ejercicio11 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      // hago algunas variables para almacenar los datos antes del bucle
      String palabra;
      int azules = 0;
      int colores = 0;
      boolean trigger = false;
      String[] arrayColores = { "negro", "rojo", "azul", "marrón", "verde", "celeste", "amarillo", "rosa", "magenta",
            "cyan", "morado", "turquesa", "gris" };
      do {
         trigger = false;
         System.out.println("introduce los nombres de colores");
         palabra = sc.nextLine();
         if (palabra.equals("azul"))
            azules++;

         for (int i = 0; i < arrayColores.length; i++) {
            if (arrayColores[i].equalsIgnoreCase(palabra)) {

               colores++;
               trigger = true;
               break;

            } else if (arrayColores[i].equalsIgnoreCase("negro")) {
               trigger = true;
            } else {
               trigger = false;
            }

         }
         if (!trigger) {
            System.out.println("Esta palabra no se autopercibe como color");
         }

      } while (!palabra.equalsIgnoreCase("negro"));
      {
         System.out.println("has introducido tantos colores: "
               + colores + " de los cuales tantas veces eran el \"azul\" " + azules);

      }
   }
}