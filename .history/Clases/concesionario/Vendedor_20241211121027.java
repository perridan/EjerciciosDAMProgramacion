package concesionario;

public class Vendedor {
    public String vendedor;
    String telefono;
    private String emailVendedor;
    double limiteKilometraje;

    public Vendedor(String vendedor, String telefono, String emailVendedor, double limiteKilometraje) {
        this.vendedor = vendedor;
        this.telefono = telefono;
        this.emailVendedor = emailVendedor;
        this.limiteKilometraje = limiteKilometraje;
    }

    public Vendedor(String vendedor, String Telefono, String emailVendedor) {
        this(vendedor, Telefono, emailVendedor, 50000);
    }

    public String getEmailVendedor() {
        return emailVendedor;
    }
    
}
