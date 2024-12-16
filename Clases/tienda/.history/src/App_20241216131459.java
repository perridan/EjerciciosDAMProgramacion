
public class App {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan", 1, 1000);
        cliente.muestraInformacion();

        Cliente cliente2 = new Cliente("Pedro", 2, 1000);
        cliente2.muestraInformacion();
        Producto producto = new Producto("Agua", "JUG", 10);
        producto.muestraInformacion();

        Compra compra = new Compra(producto, cliente, 1);
        compra.realizarCompra();

        producto = new Producto("Manzana", "MAN", 10);
        producto.muestraInformacion();

        compra = new Compra(producto, cliente, 20);
        compra.realizarCompra();
        cliente.muestraInformacion();
        //recarga de saldo
        cliente.actuazarSaldo(100, false);
        cliente.muestraInformacion();
    }
}
