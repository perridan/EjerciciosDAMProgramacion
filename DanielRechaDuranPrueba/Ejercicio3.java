/*. Escribe un programa que solicite dos números enteros al usuario. Se imprimirá por pantalla 
“¿Son los números distintos? true/false”. Donde true/false será el resultado de evaluar si los números 
introducidos son distintos. 
Plantea tu solución sin utilizar operador ternario ni estructura ‘if’ o similar.*/

//Daniel Recha
import java.util.Scanner;
public class Ejercicio3 {
public static void main (String[] args) {
    //Instaciamos la clase scanner para usarla
    Scanner scanner = new Scanner(System.in);
    
    //vamos a solicitar al usuario los valores
 System.out.println("Introduce el primer numero");
 int numero1 = scanner.nextInt();
 System.out.println("Introduce el segundo numero");
 int numero2 = scanner.nextInt();
//analizamos los valores introducidos
  boolean resultado = numero1==numero2;
  //mostramos el resultado 
  System.out.println("estos numeros son iguales? "+ resultado);
  
    }
}
