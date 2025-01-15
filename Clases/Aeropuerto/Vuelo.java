public class Vuelo {

    private String codVuelo;
    private String origen;
    private String destino;
    private int capacidad;
    private int asientosDisponibles;

    public Vuelo(String codVuelo, String origen, String destino, int capacidad) {
        this.codVuelo = codVuelo;
        this.origen = origen;
        this.destino = destino;
        this.capacidad = capacidad;
        asientosDisponibles = capacidad;
    }

    // Constructor sobrecargado, para definir solo codigo de vuelo
    public Vuelo(String codVuelo) {
        this(codVuelo, "MAD", "No definido", 250);
    }

    // setters
    void setCodVuelo(String codVuelo) {
        this.codVuelo = codVuelo;
    }

    void setOrigen(String origen) {
        this.origen = origen;
    }

    void setDestino(String origen) {
        this.destino = origen;
    }

    void setCapacidad(String destino) {
        this.destino = destino;
    }

    void setAsientosDisponibles(int asientosDisponibles) {
        if (asientosDisponibles < 0) {
            System.out.println("no se puede asignar valores negativos ");
        } else {
            this.asientosDisponibles = asientosDisponibles;

        }
    }

    // getters
    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    //metodos

    public void mostrarDatos(){
        System.out.printf("Vuelo: %s \n con origen %s \n destino %s \n asientos disponibles %d de %d  ", codVuelo, origen, destino,asientosDisponibles,capacidad);
    }

}