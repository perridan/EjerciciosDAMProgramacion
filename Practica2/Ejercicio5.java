
import java.util.Scanner;


//Practica Daniel Recha 

public class Ejercicio5 {
/* 
Pedir al usuario su edad y mostrar la que tendrá el próximo año

*/

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Dime tu edad: ");
int edad = scanner.nextInt();
//Incrementamos el valor de la edad
edad++;
System.out.println("el año que viene tendrás: "+ edad);
scanner.close();
}

}

