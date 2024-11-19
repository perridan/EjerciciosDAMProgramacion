
import java.util.Scanner;


//Practica Daniel Recha 

public class Ejercicio4 {
/* 
Escribe un programa en java que:
- Solicite un número entero y lo almacene en un variable
- Modifique el valor de la variable anterior incrementando en 2 el valor que ha 
introducido el usuario
- Imprima el nuevo valor por pantalla
*/

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Introduce un numero: ");
int numero = scanner.nextInt();
//Incrementamos el valor de la variable
numero+=2;
System.out.println("el resultado de la suma es: "+ numero);
scanner.close();
}

}