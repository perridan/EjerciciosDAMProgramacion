import java.util.Scanner;

public class EjemploMuestraNum {

    static void muestraNumeros(int n1, int n2) {
        int mayor = n1 > n2 ? n1 : n2;
        int menor = n1 < n2 ? n1 : n2;
        for (int i = menor; i < mayor; i++) {
            System.out.println(i);
            System.out.println("el numero es positivo: "+ esPositivo(i));
        }
    }

    public static void main(String[] args) {
        Init();
    }

    private static void Init() {
        int num1 = 1;
        int num2 = 1;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce numero 1");
        num1 = entrada.nextInt();

        System.out.println("Introduce numero 2");
        num2 = entrada.nextInt();
        muestraNumeros(num1, num2);
        System.out.println("el resultado es: " + suma(num1, num2));
        suma(num1, num2);
        entrada.close();
    }

    private static int suma(int num1, int num2) {
        return num1 + num2;
    }

    static boolean esPositivo(int numero) {
        boolean positivo;
        if (numero >= 0) {
            positivo = true;
        } else {
            positivo = false;
        }
        return positivo;
    }
}
