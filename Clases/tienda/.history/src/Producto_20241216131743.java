
public class Producto {

    public String nombre;
    String codProducto;
    private final double precio;

    Producto(String nombre, String codProducto, double precio) {
        this.nombre = nombre;
        this.codProducto = codProducto;
        this.precio = precio;
    }

    void muestraInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codProducto);
        System.out.println("Precio: " + precio);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }
}
