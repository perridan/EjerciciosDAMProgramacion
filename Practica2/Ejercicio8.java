
import java.util.Scanner;


//Practica Daniel Recha 

public class Ejercicio8 {
/* 
Escribe un programa java que solicite la edad al usuario y determine si el usuario es mayor 
o menor de edad, e imprima por pantalla: “Mayor de edad : XXXX” donde XXXX es true o 
false dependiendo de la edad que haya indicado el usuario.
Resuelve el ejercicio sin utilizar el operador ternario ni estructura de control (if)
*/

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Dime tu edad");
int edad = scanner.nextInt();
boolean mayorDeEdad = edad>=18; 
System.out.println("eres mayor de edad "+ mayorDeEdad);
scanner.close();
}

}