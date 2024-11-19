
import java.util.Scanner;

public class Ejercicio3
{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //introducimos el numero
        System.out.println("Introduce un numero entero");
        int numero = scanner.nextInt();
        //el otro numero que será el multiplo
        System.out.println("Introduce otro numero entero");
        int multiplo = scanner.nextInt();
        int sobrante = numero % multiplo;
        int cantidadASumar = (sobrante == 0) ? 0: multiplo - sobrante;
        
        System.out.println("al " + numero + " hay que sumarle " + cantidadASumar +" para que sea multiplo de "+ multiplo);
    }

}