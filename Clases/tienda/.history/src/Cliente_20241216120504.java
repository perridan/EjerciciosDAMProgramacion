
public class Cliente {

    public String nombre;
    private int clienteID;
    private double saldo;

    Cliente(String nombre, int clienteID, double saldo) {
        this.nombre = nombre;
        this.clienteID = clienteID;
        this.saldo = saldo;
    }

    void muestraInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + clienteID);
        System.out.println("Saldo: " + saldo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void actuazarSaldo(double nuevoSaldo, boolean comprar) {
        if (comprar) {
            if (saldo - nuevoSaldo < 0) {
                System.out.println("No puedes tener un saldo negativo");
            } else {
                this.saldo -= nuevoSaldo;
            }
        } else {
            this.saldo += nuevoSaldo;
        }

    }

}
