
public class Compra {

    Producto producto;
    Cliente cliente;
    int cantidad;

    Compra(Producto producto, Cliente cliente, int cantidad) {
        this.producto = producto;
        this.cliente = cliente;
        this.cantidad = cantidad;
    }

    void realizarCompra() {

        String mensaje = cliente.actuazarSaldo(producto.getPrecio() * cantidad, true)
                ? "Se ha realizado la compra de " + cantidad + " " + producto.nombre
                : "No se ha podido realizar la compra";

        System.out.println(mensaje);

    }
}
