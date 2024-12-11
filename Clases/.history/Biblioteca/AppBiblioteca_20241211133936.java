package Biblioteca;

public class AppBiblioteca {

    public static void main(String[] args) {
        Autor autor = new Autor("Juan", "juan@gmail.com");
        Autor autor2 = new Autor("Pepe", "juan@gmail.com");
        autor.muestraInformacion();
        autor.anadirLibro(1);
        autor.muestraInformacion();
        Libro libro1 = new Libro("El libro de la vida", "97854565656535");
        Libro libro2 = new Libro("El libro de la vida", "97854565656535");

    }
}
