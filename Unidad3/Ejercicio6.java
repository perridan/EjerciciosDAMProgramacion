import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //vamos a pedir al usuario los datos
        System.out.print("Introduce un numero: ");
        float numero = scanner.nextFloat();
        float valorAbsoluto = numero >0? numero : -1*numero;
        System.out.println("el valor absoluto es "+ valorAbsoluto  );

        
        scanner.close();
    }
        
}
