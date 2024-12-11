package biblioteca;

public class Autor {

    public String nombre;
    private final String email;
    int numeroDeLibros;

    public Autor(String nombre, String email) {
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

    public String getEmail() {
        return email;
    }

    public void setbNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
