import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //vamos a pedir al usuario los datos
       int num1 = (int)(Math.random() * 99);
       int num2 = (int)(Math.random() * 99);
System.out.println("Te voy a dar 2 numeros el "+ num1 + " y el "+ num2);
System.out.println("Cual es la suma");

        System.out.print("Introduce un numero: ");
        float numero = scanner.nextFloat();
        if (num1+num2==numero)
        {
            System.out.println("acertaste");
        }
        else
        {
            System.out.println("no acertaste");
            return;

        }

        
        scanner.close();
    }
        
}
