
import java.util.Set;

public class Mesa {
    private int numeroMesa;
    private int capacidad;
    private boolean estaLibre;

    public Mesa(int numeroMesa, int capacidad) {
        this.numeroMesa = numeroMesa;
        this.capacidad = capacidad;
        estaLibre = true;

    }

    // setters
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setEstaLibre(boolean estaLibre) {
        this.estaLibre = estaLibre;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    // getters
    public int getCapacidad() {
        return capacidad;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public boolean getEstaLibre() {
        return estaLibre;
    }

}
