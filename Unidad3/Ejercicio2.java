import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //vamos a pedir un número al usuario el DNI
        System.out.println("Escribe el DNI");
        int numero =scanner.nextInt();
        //declaramos una constante con las letras del DNI
        final String  dniLetters ="TRWAGMYFPDXBNJZSQVHLCKE";
        if (String.valueOf(numero).length()<=8)
        {
           int modulo = numero%23;
          char letra = dniLetters.charAt(modulo);
          System.out.println("tu DNI es: "+numero+letra);
        }
        else
        {
            System.out.println("El DNI tiene que tener 8 digitos");
        }

        
    }
}
