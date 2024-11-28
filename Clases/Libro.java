public class Libro {
    String titulo;
    String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro(String titulo) {
        this(titulo, "Tolkien");
    }

    public void cambiarTitulo(String nuevoTitulo) {
        titulo = nuevoTitulo;

    }

    public static void main(String[] args) {
        Libro libro = new Libro("El Señor de los anillos", "Tokien");
        System.out.printf("El libro es %s, el autor es %s\n", libro.titulo, libro.autor);
        libro.cambiarTitulo("El hobbit");
        System.out.printf("El libro es %s, el autor es %s\n", libro.titulo, libro.autor);

    }

}
