package Banco;

class CuentaCorriente {
    String dni;
    public String nombre;
    private double saldo;
    static String nombreBanco;
    private Gestor gestor;

    public CuentaCorriente(String dni, String nombre) {

        this.dni = dni;
        this.nombre = nombre;
        saldo = 0;
    }

    public CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public CuentaCorriente(String dni, String nombre, double saldo, Gestor gestor) {
        this(dni, nombre, saldo);
        this.gestor = gestor;
    }

    public CuentaCorriente(String dni, double saldo) {
        this(dni, "", saldo);
    }

    void ingresar(double cantidad) {
        saldo = saldo + cantidad;
    }

    boolean retirar(double cantidad) {
        boolean opAceptada;
        if (saldo >= cantidad) {
            saldo = saldo - cantidad;
            opAceptada = true;
        } else {
            opAceptada = false;
        }
        return opAceptada;
    }

    void muestraInformacion() {
        System.out.printf("la cuenta bancaria pertenece al cliente %s con dni %s y tiene el saldo %f \n", nombre, dni,
                saldo);
        if (gestor != null) {
            System.out.println("Gestor asociado: " + gestor.nombre);
            System.out.println("Teléfono del gestor: " + gestor.getTelefono());
        } else {
            System.out.println("No hay gestor asociado.");
        }

    }

    public static void main(String[] args) {
        CuentaCorriente cb = new CuentaCorriente("4446554D", "HolaQuetal");
        cb.ingresar(100.80);
        cb.muestraInformacion();
        System.out.println(cb.retirar(50));
        cb.muestraInformacion();

    }

    public static String getBanco() {
        return nombreBanco;
    }

    public static void setBanco(String banco) {
        nombreBanco = banco;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    public Gestor getGestor() {
        return gestor;
    }

}