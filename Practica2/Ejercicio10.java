
import java.util.Scanner;


//Practica Daniel Recha 

public class Ejercicio10 {
/* 
Escribe un programa que pida un número al usuario e indique mediante un literal booleano 
si el número es par. 
Imprimirá por pantalla “ El número es par: XXXX” donde XXXX es true o false dependiendo 
del resultado de la comprobación de número par.
Resuelve el ejercicio sin utilizar el operador ternario ni estructura de control (if)

*/

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("introduce un numero");
int numero = scanner.nextInt();
 
 //calculamos si es par o impar.
boolean isPar= (numero%2)==0;

System.out.println("Ese numero es par? : "+ isPar );


scanner.close();
}

}