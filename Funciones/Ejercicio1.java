import java.util.Scanner;

public class Ejercicio1 {

    static boolean sigo(String nombre) {
        boolean sigo;

        if (nombre.equalsIgnoreCase("fin")) {
            System.out.println("Hasta, luego, lucas");
            sigo = false;
        } else {
            System.out.println("hola, que tal estás " + nombre);
            sigo = true;
        }
        return sigo;
    }

    public static void main(String[] args) {
        inicio();
    }

    static void inicio() {
        // initializo el scanner
        Scanner entrada = new Scanner(System.in);
        String nombre;

        do {
            System.out.println("como te llamas?");
            nombre = entrada.next();
        // invoco al metodo en el while que me devuelve un boolean
        } while (sigo(nombre));
        entrada.close();
    }
}
