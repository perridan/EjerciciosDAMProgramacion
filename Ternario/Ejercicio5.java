import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[]args)
{
        Scanner scanner = new Scanner(System.in);
//introducimos los números
System.out.println("Introduce un numero");
int numero = scanner.nextInt();
//vamos a calcular el algoritmo
String resultado = (numero>=100 && numero <= 200) ? "dentro del rango " : "fuera del rango";
System.out.println(resultado) ; 
    scanner.close();
}
}