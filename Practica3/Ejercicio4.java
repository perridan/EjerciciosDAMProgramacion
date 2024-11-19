
import java.util.Scanner;
/* Crea un programa que pida la base y la altura de un triángulo y muestre su área.*/

public class Ejercicio4
{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //introducimos la base del triangulo
        System.out.println("Introduce la base del triangulo: ");
        int base = scanner.nextInt();
        //introduce la altura.
        System.out.println("Introduce la altura:");
        int altura = scanner.nextInt();
        float areaTriangulo = (float)((base * altura)/2.0f);
        System.out.println("El area del triangulo es: "+ areaTriangulo);
    }

}