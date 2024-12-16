
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
        cliente.actuazarSaldo(producto.getPrecio() * cantidad, true);
        System.out.println("Se ha realizado la compra de " + cantidad + " " + producto.nombre);
    }
}
