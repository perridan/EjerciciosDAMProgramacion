import java.util.Scanner;
/* Escribe un programa que solicite números enteros al usuario.  
Evaluará cada número para determinar si es par.  
En caso afirmativo, solicita otro número más.  
En caso negativo, finaliza la ejecución del programa con mensaje de 
finalización 
Utiliza una función que devuelve valor booleano para determinar si un número es 
par.  */

public class Ejercicio3 {

    public static void main(String[] args) {
        inicio();
    }

    static void inicio() {
        // initializo el scanner
        Scanner scanner = new Scanner(System.in);
        int entero = 0;
        do {
            System.out.print("Introduce numeros enteros: ");
            if (scanner.hasNextInt()){
                entero = scanner.nextInt();
            }else{
                System.out.println("error introduce un numero entero");
                scanner.next();
                entero = scanner.nextInt();
                continue;
            }
        } while (esPar(entero));

    }

    // Función para calcular la media con 2 parámetros
    static boolean esPar(int numero) {
        boolean resultado;
        if (numero % 2 == 0) {
            resultado = true;
            System.out.println("Genial es par");
        } else {
            resultado = false;
            System.out.println("Que mal NO es par");

        }
        return resultado;

    }

    // Función que suma las notas y calcula la media llamando a la función
    // calcularMedia

}
