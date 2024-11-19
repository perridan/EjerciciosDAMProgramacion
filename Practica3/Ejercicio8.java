
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
/*Un biólogo está realizando un estudio de distintas especies de invertebrados y necesita una 
aplicación que le ayude a contabilizar el número de patas que tienen en total todos los 
animales capturados durante una jornada de trabajo. Para ello, te ha solicitado que escribas 
una aplicación a la que hay que proporcionar: 
• El número de hormigas capturadas (6 patas). 
• El número de arañas capturadas (8 patas). 
• El número de cochinillas capturadas (14 patas). 
La aplicación debe mostrar el número total de patas.*/

public class Ejercicio8
{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //introduce total patas hormigas
        System.out.println("Introduce el numero de hormigas");
        int hormigas = scanner.nextInt();
        //introduce total patas arañas
        System.out.println("Introduce el numero de arañas");
        int aranas = scanner.nextInt();
        //introduce total patas cochinillas
        System.out.println("Introduce el numero de cochinillas");
        int cochinillas = scanner.nextInt();
        //hacemos los calculos
        int medidaTotal = (cochinillas*14) + (hormigas*6) + (aranas*8);

       System.out.println("tenemos todas estas patas: " + medidaTotal);

        scanner.close();

    }

}