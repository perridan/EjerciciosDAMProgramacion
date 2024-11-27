
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

    public Cine(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
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
        System.out.println("el cine es " + oCine.nombre + " en la ciudad " + " " + oCine.ciudad + "con la antiguedad "
                + oCine.anyos);
        Cine c1 = new Cine("Cine de las Maravillas", "Algun lugar");
        Cine c2 = new Cine("Cinepolos", "Grana");
        Cine c3 = new Cine("Palacio del Video", "Holly");
        System.out.printf("el cine c1 es %s, y esta en la ciudad %s \n", c1.nombre, c1.ciudad);
        System.out.printf("el cine c2 es %s, y esta en la ciudad %s \n", c2.nombre, c2.ciudad);
        System.out.printf("el cine c2 es %s, y esta en la ciudad %s \n", c3.nombre, c3.ciudad);
    }

}
