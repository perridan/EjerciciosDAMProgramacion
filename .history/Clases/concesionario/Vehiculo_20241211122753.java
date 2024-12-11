package concesionario;

public class Vehiculo {
    public String marca;
    String matricula;
    private double kilometraje;
    private static String nombreEmpresa;
    Vendedor vendedor;

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
    public void incrementaKilometraje(double kilometraje) {
        this.kilometraje += kilometraje;
    }
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void muestraInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Matricula: " + matricula);
        System.out.println("Kilometraje: " + kilometraje);
        System.out.println("Empresa: " + nombreEmpresa);
        if (vendedor != null) {
            vendedor.muestraInformacion();
        }
       
    }
}
