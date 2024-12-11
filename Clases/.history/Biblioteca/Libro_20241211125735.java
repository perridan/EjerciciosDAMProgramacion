
public class Libro {

    public String titulo;
    String ISBN;
    Autor autor;
    private boolean disponiblidad;

    public Libro(String titulo, String ISBN) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.disponiblidad = true;

    }

    public void pedirLibro() {
        System.out.println("Se ha pedido el libro: " + titulo);
        if (disponiblidad) {
            System.out.println("El libro está disponible, te lo presto");
            disponiblidad = false;
        } else {
            System.out.println("El libro no está disponible");

        }
    }

    public void devolverLibro() {
        if (!disponiblidad) {
            System.out.println("Se ha devuelto el libro: " + titulo);
            disponiblidad = true;
        } else {
            System.out.println("Como vas a devolver el libro si lo tenemos nosotros?");
        }

    }

    public void muestraInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Disponibilidad: " + disponiblidad);
    }
}
