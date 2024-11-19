import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // vamos a pedir al usuario los datos
        System.out.print("Introduce la base del triángulo: ");
        float base = scanner.nextFloat();

        System.out.print("Introduce la altura del triángulo: ");
        float altura = scanner.nextFloat();
        if (base < 0 || altura < 0) {
            System.out.println("no se admiten valores negativos");
            return;
        } else {
            float area = (base * altura) / 2;
            System.out.println("el area del triangulo es: " + area);

        }
        scanner.close();
    }

}
