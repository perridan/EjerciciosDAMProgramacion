
public class Empleado {
    String nombre;
    double sueldo;
    String puesto;

    public Empleado(String nombre, double sueldo, String puesto) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.puesto = puesto;
    }

    public Empleado(String nombre, String puesto) {

        this(nombre, 1080, puesto);
    }

    public void mostarInformacion() {

        System.out.printf("el empleado es %s con el puesto %s y cobra %f \n", nombre, puesto, sueldo);
    }

    public void aumentoDeSueldo(int porcentaje) {
        double calculo = (sueldo * porcentaje) / 100;
        sueldo = calculo + sueldo;
    }

    public static void main(String[] args) {
        rechautils.Tools.clearScreen();
        Empleado empleado = new Empleado("daniel", 500, "Becario");
        empleado.mostarInformacion();
        empleado.aumentoDeSueldo(10);
        empleado.mostarInformacion();
    }

}