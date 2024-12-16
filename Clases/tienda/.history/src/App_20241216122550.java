
public class App {

    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente("Juan", 1, 1000);
        cliente.muestraInformacion();
        cliente.actuazarSaldo(100, true);
        cliente.muestraInformacion();

        Cliente cliente2 = new Cliente("Pedro", 2, 1000);
        cliente2.muestraInformacion();
        cliente2.actuazarSaldo(100, true);
        cliente2.muestraInformacion();
        Producto producto = new Producto("Jugo de agua", "JUG", 10);
        producto.muestraInformacion();

        Compra compra = new Compra(producto, cliente, 1);
        compra.realizarCompra();

        producto = new Producto("Manzana", "MAN", 10);
        producto.muestraInformacion();

        compra = new Compra(producto, cliente, 2);
        compra.realizarCompra();

    }
}
