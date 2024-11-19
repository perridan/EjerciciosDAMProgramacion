import java.util.Scanner;
/*Escribe un programa que solicite un número del 1 al 7 e imprima el día de la semana 
correspondiente (1 para lunes, 2 para martes, etc.). Si el número no está en el 
rango, muestra un mensaje de error */

public class Ejercicio2 {
    public static void main(String[] args) {
        //instancio la variable scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce una nota (A-F)");
        String nota = scanner.nextLine();

        switch (nota) {
            case "A+", "a+"->
            {
                System.out.println("Matricula de Honor");
            }
            case "A", "a"->
            {
                System.out.println("Sobresaliente");
            }
            case "B","b"->{
                System.out.println("Notable");
            }
            case "C","c"->{
                System.out.println("Bien");
            }
            case "D","d"->{
                System.out.println("Suficiente");
            }
            case "F","f"->{
                System.out.println("Suspenso");
            }
            default->{
                System.out.println("Nota Incorrecta");
            }
        }

    }
}
