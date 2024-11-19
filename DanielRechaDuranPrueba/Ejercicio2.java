/*. Escribe un programa que ayude al usuario a calcular la velocidad a la que se ha desplazado 
hasta su centro de trabajo. Se solicita al usuario la distancia recorrida (en km) y el tiempo transcurrido (en 
horas).  
Se imprimirá por pantalla La velocidad es de XXX km/h, donde XXX es la velocidad calculada en función 
de los datos introducidos: velocidad = distancia/ tiempo */

//Daniel Recha
import java.util.Scanner;
public class Ejercicio2 {
public static void main (String[] args) {
  //Instaciamos la clase scanner para usarla
    Scanner scanner = new Scanner(System.in);
    
    //vamos a solicitar al usuario los valores
 System.out.println("¿Cuantos Kilometros has recorrido?");
 float distancia = scanner.nextFloat();
 System.out.println("¿Cuanto tardaste en horas?");
 float tiempo = scanner.nextFloat();

//calculamos la velocidad
  float velocidad = (distancia/tiempo) ;
  System.out.println("ibas a "+ velocidad  +" Km/h");
    }
}
