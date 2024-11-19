

import java.util.Scanner;

/*Pide dos números al usuario: a y b. Deberán mostrarse true si ambos números son iguales y 
false en caso contrario. .*/

public class Ejercicio11
{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //introduce entradas infantiles
        System.out.println("Introduce el numero a");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce el numero b");
        int numero2 = scanner.nextInt();
        boolean comprobamos = numero1==numero2;
        System.out.println("los numeros son iguales: " + comprobamos );
        System.out.println(numero1==numero2?"Los numeros son iguales":"los numeros son distintos");
        scanner.close();

    }

}