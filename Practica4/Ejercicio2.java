/*Escribe un programa java que determine si los asistentes a un evento musical tienen acceso 
preferente. Las condiciones para este tipo de acceso son: - 
Si la edad del participante es < 16 o > 65, se concede acceso preferente - 
Si la edad está comprendida entre 16 y 65 , no se concede acceso preferente salvo 
que se trate de un acompañante del alguien que sí tiene derecho a acceso preferente.
*/
import java.util.Scanner;


public class Ejercicio2 {
    
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cual es la edad del asistente");
       int edadAsistente = scanner.nextInt();
        System.out.println("El asistente acompaña a un preferente?");
        boolean acompanante= scanner.nextBoolean();
    //calculamos si el usuario es VIP
        boolean comprobacion = (edadAsistente<16 || edadAsistente>65) ||acompanante;
        System.out.println("el acceso preferente es: "+ comprobacion);
    }

}
