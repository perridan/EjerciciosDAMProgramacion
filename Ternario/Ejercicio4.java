import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[]args)
{
        Scanner scanner = new Scanner(System.in);
//introducimos los números
System.out.println("Introduce un numero");
int numero = scanner.nextInt();
//vamos a calcular el algoritmo
String resultado = (numero % 2==0)? "es par": (numero % 5==0)? "Es divisible entre 5": "Ni es par ni divisible entre 5";
System.out.println(resultado) ; 
    scanner.close();
}
}
