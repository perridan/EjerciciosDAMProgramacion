
import java.util.Scanner;
/* Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos.
La aplicación debe mostrar cuántas horas, minutos y segundos hay en el número de 
segundos introducidos por el usuario.*/

public class Ejercicio6
{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero de segundos");
        //introduccimos los segundos
        int segundos = scanner.nextInt();
        //hacemos los calculos de horas
        int horas = segundos /3600;
        //calculamos el modulo para los minutos
        int minutos = (segundos %3600)/60 ;
        //de aquí sacamos tambien los segundos
        int segundo = minutos % 60;

       System.out.println("En: " + segundos + " hay "+ horas + " horas " + minutos + " minutos  " + segundo);

        scanner.close();
    }

}