package Banco;

public class Gestor {
    String nombre;
    String telefono;
    double importeMaximo;

    public Gestor(String nombre, String telefono, double importeMaximo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = importeMaximo;
    }

    public Gestor(String nombre, String telefono) {
        this(nombre, telefono, 10000);
    }

    public String getTelefono() {
        return telefono;
    }

    protected double getImporteMaximo() {
        return importeMaximo;
    }

    protected void setImporteMaximo(double importeMaximo) {
        this.importeMaximo = importeMaximo;
    }

}
