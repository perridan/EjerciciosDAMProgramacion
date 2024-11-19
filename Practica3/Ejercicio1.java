
import java.util.Scanner;

public class Ejercicio1
{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //introducimos la base imponible
        System.out.println("Introduce la base imponible a calcular el IVA");
        float baseImponible = scanner.nextFloat();
        //introducimos el iva que nos va a quitar hacienda
        System.out.println("Que IVA se aplica");
        float iVAaAplicar = scanner.nextFloat();

        float IVA =  (baseImponible * (iVAaAplicar /100));
        float total = baseImponible + IVA;
        System.out.println("El iva a aplicar es: " + IVA + " y el total del precio es: " + total);
    }

}