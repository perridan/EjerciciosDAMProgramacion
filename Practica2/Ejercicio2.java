
import java.util.Scanner;


//Practica Daniel Recha 

public class Ejercicio2 {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Introduce un numero entero que lo vamos a multiplicar...");
int numero = scanner.nextInt();
numero*=2;
System.out.println("el número introducido es multiplicado por 2: "+ numero);
scanner.close();
}

}