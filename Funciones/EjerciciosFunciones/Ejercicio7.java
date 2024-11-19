import java.util.Scanner;
/* Escribe un programa que calcule la operación de potencia (base elevado a 
exponente) utilizando una función a la que se le pasen ambos valores, solicitados 
previamente al usuario. Los valores deben ser números enteros. 
Utiliza un bucle para obtener el resultado.*/

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce la base");
        int base = scanner.nextInt();
        System.out.println("introduce exponente");
        int exponente = scanner.nextInt();
        System.out.println("el resultado de la potencia es:" + pow(base, exponente));

    }
//funcion que calcula la potencia
    public static int pow(int base, int exponente) {
        int resultado = base;
        for (int i = 0; i < exponente - 1; i++) {
            resultado = resultado * base;
        }
        return resultado;
    }

}
