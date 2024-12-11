
public class Autor {

    public String nombre;
    private String email;
    int numeroDeLibros;

    Autor(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;

    }

    void anadirLibro(int numero) {
        numeroDeLibros += numero;
    }

    public void muestraInformacion() {
        System.out.println("Autor: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Numero de libros: " + numeroDeLibros);
    }

}
