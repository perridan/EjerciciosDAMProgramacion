
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

    public boolean actuazarSaldo(double nuevoSaldo, boolean comprar) {
        boolean saldoCambiado = false;
        if (comprar) {
            if (saldo - nuevoSaldo < 0) {
                System.out.println("No puedes tener un saldo negativo");
                saldoCambiado = false;
            } else {
                this.saldo -= nuevoSaldo;
                saldoCambiado = true;
            }
        } else {
            this.saldo += nuevoSaldo;
            saldoCambiado = true;
        }
        return saldoCambiado;

    }

}
