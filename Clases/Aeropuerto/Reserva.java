public class Reserva {
    private Vuelo vuelo;
    private Pasajero pasajero;
    private int asientosAReservar;
    private boolean confirmada;

    public Reserva(Vuelo vuelo, Pasajero pasajero, int asientosAReservar) {
        this.vuelo = vuelo;
        this.pasajero = pasajero;
        this.asientosAReservar = asientosAReservar;
        //estuve spolieandome yo mismo lo de ls thow exeption.
       if (!comprobarReserva()) throw new IllegalArgumentException("No hay asientos disponibles") ;
    }

    boolean comprobarReserva() {
        System.out.println("comprobamos reserva");
        if (vuelo.getAsientosDisponibles() < asientosAReservar) {
            System.out.println("no hay asientos disponibles");
            confirmada = false;

        } else {
            realizarReserva();
            System.out.println("reserva realizada");
            confirmada = true;
        }
        return  confirmada;

    }

    void realizarReserva() {
        vuelo.setAsientosDisponibles(vuelo.getAsientosDisponibles() - asientosAReservar);
    }

    public void muestraInformacion() {
        vuelo.mostrarDatos();
        pasajero.muestraInformacion();
        String asign = confirmada ? "confirmada" : "no confirmada";
        System.out.printf("y el número de billetes es %d, la reserva esta %s \n ", asientosAReservar, asign);
    }

}
