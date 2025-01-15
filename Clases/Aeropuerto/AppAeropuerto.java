
public class AppAeropuerto {
    public static void main(String[] args) {
        Vuelo v1 = new Vuelo("JJD55");
        v1.mostrarDatos();
        v1.setAsientosDisponibles(32);
        v1.mostrarDatos();
        Pasajero p1 = new Pasajero("pepe", "487dfd");

        //intento aquí hacer que la reserva salga y si no sale controlo la exepcion.

        try {
            Reserva reserva = new Reserva(v1, p1, 33);

        } catch (IllegalArgumentException e) {
        System.out.println("cancelo la creacion de la reserva, porque si hay overbooking que le voy a hacer");
        }

        v1.mostrarDatos();
    }
}
