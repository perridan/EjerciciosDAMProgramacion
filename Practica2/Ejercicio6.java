
import java.time.LocalDate;
import java.util.Scanner;

//Practica Daniel Recha 

public class Ejercicio6 {
/* 
Escribe un programa en java que pida el año actual y el de nacimiento del usuario. Debe 
calcular su nacimiento, suponiendo que en el año en curso el usuario ya ha cumplido años.
*/

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Cuando naciste: ");
int nacimiento = scanner.nextInt();
//Incrementamos el valor de la nacimiento
nacimiento++;
//obtengo el año actual del sistema.
LocalDate fechas =  LocalDate.now();
//realizo el calculo de la diferencia del año.
int edad =  fechas.getYear()- nacimiento+1;
System.out.println("tienes  "+ edad + " años");
scanner.close();
}

}

