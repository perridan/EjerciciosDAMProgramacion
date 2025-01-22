
import java.util.Arrays;

public class Ejercicio14 {
    public static void main(String[] args) {
        int[] valoresDupliados = { 5, 8, 5, 3, 5, 8, 9, 4 };
        System.out.println(Arrays.toString(borrarDuplicados(valoresDupliados)));

    }

    static int[] borrarDuplicados(int[] arrayConDuplicados) {
        // creamos un array para los elementos no duplicados
        int[] arrayCopy = new int[arrayConDuplicados.length];
        // ordenamos el array para hacer optima la busqueda.
        Arrays.sort(arrayConDuplicados);
        // contamos los elementos
        int contador = 1;
        // primer elemento del array, ese nunca será duplicado
        arrayConDuplicados[0] = arrayCopy[0];
        // buscamos duplicados
        for (int i = 1; i < arrayConDuplicados.length; i++) {

            if (arrayConDuplicados[i] == arrayConDuplicados[i - 1]) {
                System.out.println("valor duplicado");

            } else {
                arrayConDuplicados[i] = arrayCopy[contador];
                contador++;
                System.out.println("valor no duplicado"+ contador);

            }

        }

        return arrayCopy;
    }
}
