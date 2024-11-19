
import java.util.Scanner;


//Practica Daniel Recha 

public class Ejercicio3 {
/* 
Ejercicio 3.
Escribe un programa en java que:
- solicite dos números enteros
- devuelva como resultado la suma de los dos números
*/

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Vamos a sumar 2 numeros");
System.out.println("Introduce el primer numero: ");
int numero1 = scanner.nextInt();
System.out.println("Introduce el segundo numero: ");
int numero2 = scanner.nextInt();
// hacemos la suma
int resultado = numero1+numero2;
System.out.println("el resultado de la suma es: "+ resultado);
scanner.close();
}

}