
import java.util.Scanner;
import rechautils.Validators;

public class Cine {
    String nombre;
    String ciudad;
    int anyos;

    public Cine(String nombre, String ciudad, int anyos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.anyos = anyos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce el nombre del cine:");
        String nombreCine = scanner.nextLine();
        System.out.println("introduce el nombre de la ciudad:");
        String nombreCiudad = scanner.nextLine();
        System.out.println("introduce los años de antiguedad:");
        int antiguedad = Validators.intValidado(scanner);
        Cine oCine = new Cine(nombreCine, nombreCiudad, antiguedad);
        System.out.println("el cine es "+ oCine.nombre + " en la ciudad "+ " "+ oCine.ciudad+ "con la antiguedad "+ oCine.anyos );

    }

}
