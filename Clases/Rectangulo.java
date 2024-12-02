
public class Rectangulo {
    double ancho;
    double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo(double ancho) {
        this(ancho, ancho);
    }

    public void calculaArea() {
        double area = ancho * alto;
        System.out.printf("el area del rectangulo es %f \n", area);

    }

    public void calculaPerimetro() {
        double perimetro = 2 * (ancho + alto);
        System.out.printf("el perimetro del rectangulo es %f \n", perimetro);
    }

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(4, 8);
        rechautils.Tools.clearScreen();
        rectangulo.calculaArea();
        rectangulo.calculaPerimetro();
    }

}
