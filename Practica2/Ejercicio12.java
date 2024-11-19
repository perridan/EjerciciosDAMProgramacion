
import java.util.Scanner;


//Practica Daniel Recha 

public class Ejercicio12 {
/* 
Escribe un programa que indique si podemos salir a la calle:
- Solo podemos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas.
- Independientemente de lo anterior, podemos salir a la calle si tenemos que ir a la 
Biblioteca.
Solicitar al usuario (mediante un booleano) si necesitasIrALaBiblioteca, si ha finalizado las tareas y si necesita 
ir a la biblioteca. El programa debe responder true/false para indicar si se puede salir o no a 
la calle.
*/

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("dime un número.");
int numero = scanner.nextInt();
int valorAbsoluto = (numero <0) ? -numero:numero;

System.out.println("el valor absoluto de ese numero es numero "+ valorAbsoluto);

scanner.close();
}4

}