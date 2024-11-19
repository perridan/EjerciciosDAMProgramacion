import java.util.Scanner;
/*Escribe un programa que solicite un número del 1 al 7 e imprima el día de la semana 
correspondiente (1 para lunes, 2 para martes, etc.). Si el número no está en el 
rango, muestra un mensaje de error */

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un numero");
        int hola = scanner.nextInt();

        switch (hola) {
            case 1->
            {
                System.out.println("Enero");
            }
            case 2->{
                System.out.println("Febrero");
            }
            case 3->{
                System.out.println("Marzo");
            }
            case 4->{
                System.out.println("Abril");
            }
            case 5->{
                System.out.println("Mayo");
            }
            case 6->{
                System.out.println("Junio");
            }
            case 8->{
                System.out.println("Agosto");
            }
            case 9->{
                System.out.println("Septiembre");
            }
            case 10->{
                System.out.println("Octubre");
            }
            case 11->{
                System.out.println("Noviembre");
            }
            case 12->{
                System.out.println("Diciembre");
            }
            default->{
                System.out.println("Mes Erroneo.");
            }
        }

    }
}
