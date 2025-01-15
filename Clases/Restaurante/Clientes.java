public class Clientes {
    private String nombreCliente;
    private String identificadorCliente;
    private Mesa mesaAsignada;

    public Clientes(String nombreCliente, String identificadorCliente) {
        this.nombreCliente = nombreCliente;
        this.identificadorCliente = identificadorCliente;
    }
    public void muestraInformacion(){
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Id del cliente: " + identificadorCliente);

    }
    

}
