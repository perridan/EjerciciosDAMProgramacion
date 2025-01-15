public class Pasajero {
    private String nombre;
    private String idPasajero;

    public Pasajero(String nombre, String idPasajero) {
        this.nombre = idPasajero;
        this.idPasajero = idPasajero;
    }

    //setter
    public void setIdPasajero(String idPasajero) {
        this.idPasajero = idPasajero;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //getter
    public String getIdPasajero() {
        return idPasajero;
    }

    public String getNombre() {
        return nombre;
    }
    //metodos
    public void muestraInformacion(){
        System.out.printf("El nombre del pasajero es %s, y su identificador es %s\n ", nombre, idPasajero);

    }


   

    
    

}
