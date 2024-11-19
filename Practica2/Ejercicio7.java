
import java.util.Scanner;


//Practica Daniel Recha 

public class Ejercicio7 {
/* 
Ejercicio 3.
Escribe un programa en java que:
- solicite dos números enteros
- devuelva como resultado la suma de los dos números
*/

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Vamos a calcular la media aritmetica");
System.out.println("Introduce la primera nota: ");
int numero1 = scanner.nextInt();
System.out.println("Introduce la segunda nota: ");
int numero2 = scanner.nextInt();
// hacemos la suma
float resultado = (numero1+numero2)/2.0f ;
System.out.println("el resultado de la media aritmetica es: "+ resultado);
scanner.close();
}

}