
package concesionario;

public class AppVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("0444KSF");
        Vehiculo vehiculo2 = new Vehiculo("sear","4745GBD");
        Vehiculo.setNombreEmpresa("PowerCar");
        vehiculo2.muestraInformacion();
        vehiculo1.muestraInformacion();
        Vendedor vendedor = new Vendedor("Pepito","99999933","hola@hola.com");
        vehiculo1.setVendedor(vendedor);
        vehiculo1.muestraInformacion();

    }
}
