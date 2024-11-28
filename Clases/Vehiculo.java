public class Vehiculo {

    String tipo;
    int numeroDeRuedas;
    String estado;

    public Vehiculo(String tipo, int numeroDeRuedas, String estado) {
        this.tipo = tipo;
        this.numeroDeRuedas = numeroDeRuedas;
        this.estado = estado;
    }
    public Vehiculo (String tipo){
         this("Coche", 4, "nuevo");
    }

    void mostrarDetalles() {
        System.out.printf("el vehiculo es del tipo %s tiene %d ruedas y su estado %s",tipo, numeroDeRuedas, estado);

    }
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Coche", 4, "Usado");
        rechautils.Tools.clearScreen();
        vehiculo.mostrarDetalles();
    }

}