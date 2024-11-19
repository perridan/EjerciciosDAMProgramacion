
import java.util.Scanner;
/*Dado el siguiente polinomio de segundo grado:
𝑦 = 𝑎𝑥2 + 𝑏𝑥 + 𝑐
crea un programa que pida los coeficientes a, b y c, así como el valor de x, y calcula el valor 
correspondiente de y.*/

public class Ejercicio5
{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //introducimos la base del triangulo
        System.out.println("Introduce el valor de a: ");
        int a = scanner.nextInt();
        System.out.println("Introduce el valor de b: ");
        int b = scanner.nextInt();
        System.out.println("Introduce el valor de c: ");
        int c = scanner.nextInt();
        System.out.println("Introduce el valor de x: ");
        int x = scanner.nextInt();

        //introduce la altura.
       
        float y =  (float) (a * Math.pow(x,2)+ b*x+c);
        System.out.println("el resultado de la ecuacion es: "+ y);
        scanner.close();
    }

}