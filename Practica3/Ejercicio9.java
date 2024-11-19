

import java.util.Scanner;

/*Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude a 
calcular el importe que hay que cobrar en la taquilla por la compra de una serie de entradas 
(cuyo número será introducido por el usuario). Existen dos tipos de entrada: infantiles, que 
cuestan 15,50€; y de adultos, que cuestan 20€. 
En el caso de que el importe total sea igual o superior a 100€, se aplicará automáticamente 
un bono descuento del 5%.*/

public class Ejercicio9
{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //introduce entradas infantiles
        System.out.println("Introduce el numero de entradas infantiles");
        int infantiles = scanner.nextInt();
        //introduce total patas arañas
        System.out.println("Introduce el numero de entradas de adultos");
        int adultos = scanner.nextInt();
        //precios de entrada
        float precioInfantil = 15.50f;
        float precioAdulto = 20.00f;
        //hacemos los calculos
        float totalEntradas = (float) ((infantiles*precioInfantil) + (adultos*precioAdulto));
        float conDescuento = totalEntradas >= 100.0f ? totalEntradas *1.05f: totalEntradas;

        System.out.println(" el precio total de entradas: " + conDescuento);

        scanner.close();

    }

}