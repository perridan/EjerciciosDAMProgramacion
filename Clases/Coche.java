
public class Coche {
    String marca;
    String modelo;
    int anyo;

    public Coche(String marca, String modelo, int anyo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyo = anyo;
    }
    public Coche(String modelo, int anyo){
        marca = "SEAT"; 
        this.modelo = modelo;
        this.anyo= anyo;

    }
    public Coche(int anyo){
       this("Ibiza", anyo);
       

    }

    public void arrancar() {
        System.out.println("arranca el coche " + marca + " modelo " + modelo + " del año " + anyo);
    }

    public static void main(String[] args) {
        Coche c1 = new Coche("Ford", "Fiesta", 2018);
        c1.arrancar();
        Coche c2 = new Coche ("Ibiza",1999);
        c2.arrancar();
    }
}
