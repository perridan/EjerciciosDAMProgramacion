import java.util.Scanner;

public class Ejercicio3 {
    // Moodelo 1 - Zodiaco
    public static void main(String[] arrs) {
        Scanner scanner = new Scanner(System.in);
        // creo variable resultado
        // solicitamos el mes de nacimiento
        System.out.println("cual es tu mes de nacimiento 1-12?");
        int mes = scanner.nextInt();
        // recogemos en una variable con un switch de sintaxis nueva el
        String zodiaco = switch (mes) {
            case 1 -> {
                yield "Capricornio";
            }
            case 2 -> {
                yield "Acuario";
            }
            case 3 -> {
                yield "Piscis";
            }
            case 4 -> {
                yield "Aries";
            }
            case 5 -> {
                yield "Tauro";
            }
            case 6 -> {
                yield "Geminis";
            }
            case 7 -> {
                yield "Cancer";
            }
            case 8 -> {
                yield "Leo";
            }
            case 9 -> {
                yield "Virgo";
            }
            case 10 -> {
                yield "Libra";
            }
            case 11 -> {
                yield "Scorpio";
            }
            case 12 -> {
                yield "Sagitario";
            }

            default -> {
                yield "ERROR";
            }

        };
        // imprimimos el mes
        if (zodiaco.equals("ERROR")) {
            System.out.println("Ese mes no existe");
        } else {
            System.out.println("el mes introducido corresponde al signo del zodiaco: " + zodiaco);
        }
        scanner.close();
    }
}
