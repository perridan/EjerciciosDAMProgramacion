
import java.util.Scanner;


//Practica Daniel Recha 

public class Ejercicio9 {
/* 
Escribe un programa java que calcule la longitud y el área de una circunferencia e imprima 
por pantalla ambos datos calculados. Para ello, el usuario debe introducir el radio (que 
puede contener decimales).
Utiliza una constante para el número PI.
Longitud = 2PI x radio
Area = PI * (radio)2
*/

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("introduce un radio");
float radio = scanner.nextFloat();
//declaramos la constante pi
final double pi = Math.PI;

 //calculo de la circuferencia.
double longitud = (( 2*  pi ) * radio);
double area = pi * Math.pow(radio, 2);

System.out.println("La longitud de la circuferencia es: " + longitud);
System.out.println("El area de la circuferencia es: " + area);

scanner.close();
}

}