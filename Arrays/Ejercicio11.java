import java.util.Scanner;

public class Ejercicio11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] diasPorMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" };

        System.out.println("introduce el mes del año: ");
        String entrada = scanner.nextLine().toLowerCase();
        int position = -1;
        for (int i = 0; i < meses.length; i++) {
            if (entrada.contains(meses[i])) {
                position = i;
                break;
            }
        }
        if (position<0){
            System.out.println("mes erroneo");
        }
        else{
            System.out.printf("el mes introducido es %s y tiene %d días", meses[position], diasPorMes[position]);
        }

    }
}
