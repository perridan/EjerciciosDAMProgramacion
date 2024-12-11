public class Libro 
{
    public String titulo;
    String ISBN;
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
}