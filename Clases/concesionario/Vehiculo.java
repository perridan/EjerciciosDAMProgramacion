package concesionario;

public class Vehiculo {
    public String marca;
    String matricula;
    private double kilometraje;
    private static String nombreEmpresa;

    public Vehiculo(String matricula) {
        this("", matricula);
    }

    public Vehiculo(String marca, String matricula) {
        this.marca = marca;
        this.matricula = matricula;
        this.kilometraje = 0;
    }

    public static String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public static void setNombreEmpresa(String nombre) {
        nombreEmpresa = nombre;

    }
}