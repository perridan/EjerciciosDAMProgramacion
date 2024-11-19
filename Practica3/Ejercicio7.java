
import java.util.Scanner;
/* Solicita al usuario tres distancias:
• La primera, medida en milímetros.
• La segunda, medida en centímetros.
• La última, medida en metros.
Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en 
centímetros)*/

public class Ejercicio7
{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //introduce medida en mm
        System.out.println("Introduce una medida en milimetros mm");
        int medidaMm = scanner.nextInt();
        //introduce medida en mm
        System.out.println("Introduce una medida en centimetros cm");
        int medidaCm = scanner.nextInt();
        System.out.println("Introduce una medida en metros m");
        int medidaM = scanner.nextInt();
        //hacemos los calculos
        int medidaTotal = (medidaM*100) + (medidaMm/10) + medidaCm;

       System.out.println("la medida total es: " + medidaTotal);

        scanner.close();
    }

}