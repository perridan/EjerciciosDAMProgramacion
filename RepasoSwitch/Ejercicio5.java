import java.util.Scanner;
/*Escribe un programa que solicite una medida en ‘metros’ y a continuación solicite a 
qué unidad de medida se quiere convertir. Valores posibles : km, cm, mm. Los 
literales de la medida a convertir no son sensibles a mayúscula/minúscula.  
El programa devuelve el valor convertido. Muestra un mensaje de error si la opción 
es inválida. Utiliza la estructura switch ‘nueva’ */

public class Ejercicio5 {
    public static void main(String[] args) {
        // inicializamos el escaner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un Codigo de vuelo MAD PMI VLC ZGZ");
        // Solicitamos el numero de metros
        String codigo = scanner.next();
        // solicitamos la unidad de medida
        // la convierto a minusculas para que sea case insensitive.
        codigo = codigo.toLowerCase();
        String currentCiudad; 
        // compruebo que unidad de medida ha introducido el usuario.
        float resultado = switch (codigo) {
            case "mad" -> {
                currentCiudad = "MAD";           

                yield 120;

            }
            case "pmi" -> {
                System.out.println("¿eres residente de las islas canarias?");
                String isResidente= scanner.nextLine().toLowerCase();
                currentCiudad = "PMI";           

                switch (isResidente) {
                    case "si"->{yield (float)(240 *0.25); }
                    case "no"->{yield 240f;}
                    default->{yield 240f;}             
                } 
            }
            case "vlc" -> {
                currentCiudad = "VLC";           

                yield 85;
            }
            case "zgz" -> {
                currentCiudad = "ZGZ";           

                yield 160;
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
