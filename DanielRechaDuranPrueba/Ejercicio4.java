/*Escribe un programa que solicite al usuario la calificación obtenida en la prueba (número 
entero positivo). Si el número es >= 5, se imprime por pantalla “Se ha aprobado la prueba”, en otro caso se 
imprime “No se ha aprobado la prueba”. 
Utiliza el operador ternario.*/

//Daniel Recha
import java.util.Scanner;
public class Ejercicio4 {
public static void main (String[] args) {
    //Instaciamos la clase scanner para usarla
    Scanner scanner = new Scanner(System.in);
    
    //vamos a solicitar al usuario la calificación
 System.out.println("Introduce la calificación de la prueba");
 int calificacion = scanner.nextInt();
//Analizamos el valor introducido por el usuario
  String resultado = calificacion>=5? "Se ha Aprobado la prueba" :"Se ha suspendido la prueba"; 
 //lo mostramos por pantalla
  System.out.println(resultado);
  
    }
}
