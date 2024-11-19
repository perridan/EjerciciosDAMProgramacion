/*Desarrolla un programa para uso en la caja de una pizzería, para calcular el total de los 
pedidos, teniendo en cuenta que cada pizza cuesta 9€ El programa pregunta al usuario cuántas pizzas se quiere facturar 
Pregunta si el cliente es socio 
Para calcular el precio total, si el cliente es socio, se aplica un descuento de 3€ o Si no es socio, no se aplica desccuento 
Se imprime al final El precio del pedido es XX €, donde XX es el total calculado (en 
*/
import java.util.Scanner;


public class Ejercicio1 {
    
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas pizzas se quieren facturar");
       int pizzas = scanner.nextInt();
        System.out.println("El cliente es socio?");
        boolean esSocio= scanner.nextBoolean();

        double total = esSocio ? (pizzas * 9) -3 : (pizzas*9);
        System.out.println("el precio de las pizzas es: "+ total);
    }

}
