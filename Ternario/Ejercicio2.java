import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[]args)
{
        Scanner scanner = new Scanner(System.in);
//introducimos los números
System.out.println("Introduce el primer número");
int num1 = scanner.nextInt();
System.out.println("Introduce el segundo número");
int num2 = scanner.nextInt();
System.out.println("Introduce el segundo número");
int num3 = scanner.nextInt();
//vamos a calcular el algoritmo
int resultado = (num1<num2 & num1 < num3)? num1:(num2 < num3 ? num2 : num3);
System.out.println("el número es menor es: "+  resultado) ; 
    scanner.close();
}
}
