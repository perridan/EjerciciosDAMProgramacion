import java.time.LocalDateTime;

class Texto {
    private StringBuilder contenido;
    private int longitudMaxima;
    private LocalDateTime fechaCreacion;
    private LocalDateTime ultimaModificacion;

    public Texto(int longitudMaxima) {
        this.longitudMaxima = longitudMaxima;
        fechaCreacion = LocalDateTime.now();
        ultimaModificacion = LocalDateTime.now();
    }

    public boolean addCharacter(char character, boolean start) {
        boolean sePudo = false;
        if (start) {
            if (contenido.length() < longitudMaxima) {
                contenido.insert(character, 0);
                registrarModificacion();
                sePudo = true;
            }

        } else {
            if (contenido.length() < longitudMaxima) {
                contenido.append(character);
                registrarModificacion();
                sePudo = true;
            }

        }

        return sePudo;
    }

    public boolean anadirCadena(String cadena, boolean start) {
        boolean sePudo = false;
        if (start) {
            if (contenido.length() + cadena.length() <= longitudMaxima) {
                contenido.insert(0, cadena);
                registrarModificacion();
                sePudo = true;

            }
        } else {
            if (contenido.length() + cadena.length() <= longitudMaxima) {
                contenido.append(cadena);
                registrarModificacion();
                sePudo = true;

            }
        }
        return sePudo;
    }

    private void registrarModificacion() {
        this.ultimaModificacion = LocalDateTime.now();
    }

    public static void main(String[] args) {

    }
}