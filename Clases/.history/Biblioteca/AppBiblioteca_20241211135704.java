package biblioteca;

import biblioteca.Autor;

public class AppBiblioteca {

    public static void main(String[] args) {
        Autor autor = new Autor("Juan", "juan@gmail.com");
        Autor autor2 = new Autor("Pepe", "frenetismo@gmail.com");
        autor.muestraInformacion();
        autor.anadirLibro(1);
        autor.muestraInformacion();
        Libro libro1 = new Libro("El libro de la vida", "97854565656535");
        Libro libro2 = new Libro("El libro de las cosas", "9785454443351");
        Libro libro3 = new Libro("Ejercicios Extremos", "978545563351");
        Libro libro4 = new Libro("Programacion Extrema", "97854454543351");
        libro1.setAutor(autor);
        libro2.setAutor(autor);
        libro3.setAutor(autor2);
        libro1.muestraInformacion();
        libro1.pedirLibro();
        libro4.devolverLibro();
        libro1.muestraInformacion();
        libro2.devolverLibro();
        libro3.pedirLibro();
        libro3.devolverLibro();
        libro4.muestraInformacion();
        libro2.muestraInformacion();
        libro3.muestraInformacion();
        libro4.muestraInformacion();

    }
}
