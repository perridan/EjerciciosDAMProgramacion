import java.util.Scanner;
import rechautils.Validators;
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("que numero buscamos?");
      int busqueda =  Validators.intValidado(scanner);

        int[] t = { 4, 5, 8, 3, 8, 9, 3 };
        int position =  buscar(t, busqueda);
        System.out.printf("la posición deseada es %d o lo que es lo mismo buscabas el numero %d, date cuenta que es la primera ocurrencia de la lista", position, t[position]);


    }

    static int buscar(int t[], int clave) {
        int resultado = -1;
        for (int i = 0; i < t.length; i++) {
            if (t[i]==clave){
                resultado = i;
                break;
            }
            
        }

        return resultado;

    }

}
