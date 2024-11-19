import java.util.Scanner;

public class Ejercicio2 {
    // Moodelo 1 - Supermercado

    public static void main(String[] arrs) {
        Scanner scanner = new Scanner(System.in);
        // creo variable resultado
        double resultado = 0;
        // solicitamos el precio del producto
        System.out.println("cual es el precio del producto?");
        double precioProducto = scanner.nextDouble();
        // solicitamos el tipo de producto

        System.out.println("Cual es el tipo del producto? \"Frescos\" \"Textil\" \"Electro\" ");
        String producto = scanner.next();
        // realizamos la comprobación con el switch clásico.
        switch (producto) {
            case "Frescos":
                resultado = precioProducto > 10.00 ? (precioProducto * 1.04) : precioProducto;
                System.out.println("el precio a pagar por el producto de Frescos es: " + resultado);

                break;
            case "Textil":
                resultado = precioProducto * 1.10;
                System.out.println("el precio a pagar por el producto de Textil es: " + resultado);

                break;
            case "Electro":
                resultado = precioProducto * 1.21;
                System.out.println("el precio a pagar por el producto de Electro es: " + resultado);
                break;

            default:
                System.out.println("Producto erroneo");
                break;
        }
scanner.close();
    }
    
}
