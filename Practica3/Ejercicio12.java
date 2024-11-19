

import java.util.Scanner;

/*La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una competición 
donde cada participante escribe un algoritmo en un papel y lo lanza, ganando quien consiga 
lanzarlo más lejos. La peculiaridad del concurso es que la longitud del lanzamiento se mide 
en metros (con tantos decimales como se desee), pero para el ranking solo se tiene en cuenta 
la longitud en centímetros (sin decimales). Por ejemplo, para un lanzamiento de 12,3456 m 
(que son 1234,56 cm) solo se contabilizarán 1234 cm. 
Realiza un programa que solicite la longitud (en metros) de un lanzamiento y muestre la parte 
entera correspondiente en centímetros.*/

public class Ejercicio12
{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //introduce entradas infantiles
        System.out.println("Introduce el lanzamiento en metros: ");
        float valorEnMetros = scanner.nextFloat();
        float valorEnCentimetros = valorEnMetros *100;
        
        int resultado = (int)Math.floor(valorEnCentimetros);
        System.out.println("el resultado de la prueba de la FILA es "+ resultado);
        scanner.close();

    }

}