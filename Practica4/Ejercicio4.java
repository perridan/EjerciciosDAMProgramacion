/*Escribe un programa java que determine si un año, introducido por el usuario, es bisiesto o 
no.  
Imprime el mensaje “¿Es el año AAAA bisiesto? : true/false” donde AAAA es el año indicado 
por el usuario. 
Considera que un año es bisiesto si es múltiplo de 4 pero no de 100 , o bien, es múltiplo de 
400. 
*/
import java.util.Scanner;


public class Ejercicio4 {
    
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un año: ");
       int anio = scanner.nextInt();
       boolean esBisiesto =(anio%4==0&& anio%100!=0)|| (anio % 400==0);
       System.out.print("El año "+ anio +" es ");
        System.out.println(esBisiesto? "es bisiesto":"no es bisiesto ");

    }

}
