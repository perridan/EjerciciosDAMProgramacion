
import java.util.Scanner;


//Practica Daniel Recha 

public class Ejercicio13 {
/* 
Escribe un programa que solicite las notas del primer, segundo y tercer trimestre (números 
enteros). Calcular la media de los 3 trimestres y mostrar por pantalla la nota media con solo 
la parte entera, y la nota media con los decimales
*/

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("cual fue la nota del primer trimestre?");
int notaPrimerTrimestre = scanner.nextInt();
System.out.println("cual fue la nota del Segundo trimestre?");
int notaSegundoTrimestre = scanner.nextInt();
System.out.println("cual fue la nota del Tercer trimestre?");
int notaTercerTrimestre = scanner.nextInt();

// calulamos la media en decimal

float media= (float)((notaPrimerTrimestre + notaSegundoTrimestre +notaTercerTrimestre)/(3.0f));

System.out.println("La nota media sin decimales (truncada) es  "+ (int)media + "con decimales es: " + media );

scanner.close();
}

}
