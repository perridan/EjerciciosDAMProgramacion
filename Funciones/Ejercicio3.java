import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        inicio();
    }

    static void inicio() {
        // initializo el scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dos o 3 numeros?");
        int cantidad = scanner.nextInt();
        if (cantidad == 2 || cantidad == 3) {
           double[] numeros = new double[cantidad];  
            for (int i = 0; i < cantidad; i++) {
                System.out.println("inserta el numero " + i);
               numeros[0] = scanner.nextInt();
            }
            if (numeros.length==3){
               System.out.println("el maximo es: "+max(numeros[0], numeros[1], numeros[2])); 
            }
            else
            {
              System.out.println("el maximo es "+ max(numeros[0], numeros[1]));  
            }
        
        }

        else {
            System.out.println("No tengo sobrecargas para eso");
        }

    }

    static double max(double num1, double num2) {
        double resultado = 0;
        resultado = num1 > num2 ? num1 : num2;

        return resultado;
    }

    static double max(double num1, double num2, double num3) {
        double resultado = 0;
        resultado =  (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        return resultado;
    }

}
