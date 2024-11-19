import java.util.Scanner;
/*Escribe un programa que solicite un número del 1 al 7 e imprima el día de la semana 
correspondiente (1 para lunes, 2 para martes, etc.). Si el número no está en el 
rango, muestra un mensaje de error */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un numero");
        int hola = scanner.nextInt();

        switch (hola) {
            case 1->
            {
                System.out.println("Lunes");
            }
            case 2->{
                System.out.println("Martes");
            }
            case 3->{
                System.out.println("Miercoles");
            }
            case 4->{
                System.out.println("Jueves");
            }
            case 5->{
                System.out.println("Viernes");
            }
            case 6->{
                System.out.println("Sabado");
            }
            case 7->{
                System.out.println("Domingo");
            }
            default->{
                System.out.println("No corresponde con ningun día de la semana.");
            }
        }

    }
}
