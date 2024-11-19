import java.util.Scanner;
/* Escribe un programa que solicite la nota de las diferentes asignaturas del ciclo 
(BBDD, PROG, F.BBDD, ENT, ITPE, LM, SSII) y con una función con 2 parámetros 
calcule la media del curso y la devuelva con un valor double.  
El programa finaliza imprimiendo el resultado en pantalla  */

public class Ejercicio1 {
private static int errors;
    static boolean sigo(String nombre) {
        boolean sigo;

        if (nombre.equalsIgnoreCase("fin")) {
            System.out.println("Hasta, luego, lucas");
            sigo = false;
        } else {
            System.out.println("hola, que tal estás " + nombre);
            sigo = true;
        }
        return sigo;
    }

    public static void main(String[] args) {
        inicio();
    }

    static void inicio() {
        // initializo el scanner
        while (true) {
                    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la nota de PROG: ");
        double notas = addNotas(scanner);

        System.out.print("Introduce la nota de F.BBDD: ");
         notas += addNotas(scanner);

        System.out.print("Introduce la nota de ENT: ");
         notas += addNotas(scanner);

        System.out.print("Introduce la nota de ITPE: ");
         notas += addNotas(scanner);

        System.out.print("Introduce la nota de LM: ");
         notas += addNotas(scanner);

        System.out.print("Introduce la nota de SSII: ");
         notas += addNotas(scanner);
         System.out.println("la media es: "+calcularMedia(notas, 6) );

        }
    }

    private static double addNotas(Scanner scanner) {
       double notas = scanner.nextDouble();
        if (notas <0 ||notas >10)
        {
            System.out.println("error al introducir las notas");
            errors++;
            if (errors >=2)
            {
                System.exit(0);
            }
            addNotas(scanner);
            return 0;
        }
        else
        {
            return notas;
        
        }

    }
    // Función para calcular la media con 2 parámetros
    public static double calcularMedia(double sumaNotas, int cantidad) {
        return sumaNotas / cantidad;
    }

    // Función que suma las notas y calcula la media llamando a la función calcularMedia
    
}
