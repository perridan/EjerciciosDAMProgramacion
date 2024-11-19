import java.util.Scanner;
/*Escribe un programa que solicite una medida en ‘metros’ y a continuación solicite a 
qué unidad de medida se quiere convertir. Valores posibles : km, cm, mm. Los 
literales de la medida a convertir no son sensibles a mayúscula/minúscula.  
El programa devuelve el valor convertido. Muestra un mensaje de error si la opción 
es inválida. Utiliza la estructura switch ‘nueva’ */

public class Ejercicio6 {
    public static void main(String[] args) {
        // inicializamos el escaner
        Scanner scanner = new Scanner(System.in);
        System.out.println("escribe una medida en metros");
        // Solicitamos el numero de metros
        float medida = scanner.nextFloat();
        // solicitamos la unidad de medida
        System.out.println("en que unidad de medida los convertimos?");
        String unidadMedida = scanner.next();
        // la convierto a minusculas para que sea case insensitive.
        unidadMedida = unidadMedida.toLowerCase();
        // compruebo que unidad de medida ha introducido el usuario.
        float resultado = switch (unidadMedida) {
            case "km" -> {
                yield medida * 0.001f;
            }
            case "cm" -> {
                yield medida * 100;
            }
            case "mm" -> {
                yield medida * 1000;
            }
            // valor por defecto
            default -> {
                System.out.println("no se introdujo la medida adecuada");
                yield -1;
            }
        };
        System.out.println("el resultado es " + resultado);

    }
}
