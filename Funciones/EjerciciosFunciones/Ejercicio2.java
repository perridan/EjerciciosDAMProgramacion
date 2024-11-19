import java.util.Scanner;
/* Escribe un programa que solicite  
a. un valor que corresponde con el total de una factura 
b. el valor del % de impuesto a aplicar  
Utiliza una función con 2 parámetros que calcule el total final de la factura. El 
programa finaliza imprimiendo el resultado en pantalla.  */

public class Ejercicio2 {

    static int errors = 0;

    public static void main(String[] args) {
        inicio();
    }

    static void inicio() {
        while (true) {
            // initializo el scanner
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce el importe de la factura: ");
            double importe = scanner.nextDouble();
            // pido los impuestos
            System.out.print("cuanto se lleva hacienda? ");
            double impuesto = scanner.nextDouble();
            // devuelvo el resultado
            System.out.println("el importe de la factura es: " + calcularFactura(importe, impuesto));
        }

    }

    // Función para calcular la media con 2 parámetros
    public static double calcularFactura(double valorFactura, double impuesto) {
        if (valorFactura < 0 || impuesto > 100) {
            System.out.println("error en los datos introducidos");
            errors++;
            if (errors >= 2) {
                System.exit(0);
            }
        }
        return (((valorFactura * impuesto) / 100) + valorFactura);
    }

    // Función que suma las notas y calcula la media llamando a la función
    // calcularMedia

}
