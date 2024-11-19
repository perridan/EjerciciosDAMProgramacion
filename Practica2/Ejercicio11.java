
import java.util.Scanner;


//Practica Daniel Recha 

public class Ejercicio11 {
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
System.out.println("Voy a hacerte unas preguntas.");
System.out.println("Esta lloviendo?");
boolean llueve = scanner.nextBoolean();
System.out.println("¿Hemos acabado las tareas?");
boolean tareasAcabadas = scanner.nextBoolean();
System.out.println("¿Necesitas ir a la biblioteca?");
boolean necesitasIrALaBiblioteca = scanner.nextBoolean();
 
 
 //calculamos el operador logico.

boolean resultado = (llueve && tareasAcabadas) || necesitasIrALaBiblioteca;

System.out.println("¿puedo salir? "+ resultado );


scanner.close();
}

}