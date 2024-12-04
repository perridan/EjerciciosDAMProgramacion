import java.time.LocalDateTime;
import java.util.Scanner;

class Texto {
    private StringBuilder contenido;
    private int longitudMaxima;
    private LocalDateTime fechaCreacion;
    private LocalDateTime ultimaModificacion;
    private int contador;

    public Texto(int longitudMaxima) {
        this.longitudMaxima = longitudMaxima;
        contenido = new StringBuilder();
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

    private int CuentaVocales(StringBuilder contenido) {
        String tempString = contenido.toString().toLowerCase();
        contador = 0;
        for (int i = 0; i < tempString.length(); i++) {
            if (tempString.charAt(i) == 'a' || tempString.charAt(i) == 'e' || tempString.charAt(i) == 'i'
                    || tempString.charAt(i) == 'o' || tempString.charAt(i) == 'u') {
                contador++;
            }

        }
        return contador;
    }

    private void registrarModificacion() {
        this.ultimaModificacion = LocalDateTime.now();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Texto texto = new Texto(24);
        texto.anadirCadena("hola que tal", true);
        texto.muestraInformacion();
        texto.addCharacter(rechautils.Validators.validarChar(scanner), false);
        texto.muestraInformacion();
        texto.anadirCadena(scanner.next(), true);
        texto.muestraInformacion();

    }

    public void muestraInformacion() {
        CuentaVocales(contenido);
        System.out.printf(
                "La cadena es %s la longitud maxima no debe pasar de %d, tiene %d \n y tiene %d vocales\n la fecha de creacion es %s y la de modificacion es %s\n ",
                contenido, longitudMaxima, contenido.length(), contador, fechaCreacion.toString(),
                ultimaModificacion.toString());
    }
}