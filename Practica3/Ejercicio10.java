

import java.util.Scanner;

/*Solicita al usuario un número real y calcula su raíz cuadrada. Implementa el programa 
utilizando el nombre cualificado de las clases, en lugar de utilizar ninguna importación.*/

public class Ejercicio10
{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //introduce entradas infantiles
        System.out.println("Introduce el numero real al que vamos a calcular la raiz");
        float numeroReal = scanner.nextFloat();
        double raizCuadrada = java.lang.Math.sqrt(numeroReal);
        System.out.println(" la raíz cuadrada es: " + raizCuadrada );
        scanner.close();

    }

}