import java.util.Scanner;
/*  Escribe un programa que utilice una función sobrecargada para realizar operaciones 
aritméticas. 
a. Si se invoca con 2 parámetros (numéricos) devuelve la suma de ambos 
valores 
b. Si se invoca con 3 parámetros (2 numéricos y el tercero un operador 
aritmético: +, - , / o *) devuelve el resultado de la operación pasada como 
tercer parámetro.   */

public class Ejercicio5 {
    public static int errors = 0;

    public static void main(String[] args) {
    Scanner scanner=  new Scanner(System.in);
    System.out.println("Introduce las horas de 1");
    int horas1= scanner.nextInt();
    System.out.println("Introduce las minutos de 1");
    int minutos1= scanner.nextInt();
    System.out.println("Introduce las horas de 2");
    int horas2= scanner.nextInt();
    System.out.println("Introduce las minutos de 2");
    int minutos2= scanner.nextInt();
    int resultado= diferenciaMin(horas1, minutos1, horas2, minutos2);
    System.out.println("el resultado es: "+ resultado);
    }

    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
        // Convertir las horas y minutos a minutos totales desde las 00:00
        int minutos1 = hora1 * 60 + minuto1;
        int minutos2 = hora2 * 60 + minuto2;
    
        // Calcular la diferencia absoluta entre ambos tiempos en minutos
        return Math.abs(minutos1 - minutos2);
    }

    


    }

    // Función que suma las notas y calcula la media llamando a la función
    // calcularMedia


