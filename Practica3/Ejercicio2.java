
import java.util.Scanner;

public class Ejercicio2
{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //introducimos el numero
        System.out.println("Introduce un numero entero");
        int numero = scanner.nextInt();
        //hacemos el calculo del sobrante
        int sobrante = numero % 7;
        int cantidadASumar = (sobrante == 0) ? 0: 7 - sobrante;
        
        System.out.println("al " + numero + " hay que sumarle " + cantidadASumar +" para que sea multiplo de 7");
    }

}