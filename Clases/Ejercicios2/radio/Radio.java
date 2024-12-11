

public class Radio {
    double minFrequency = 80;
    double maxFrequency = 105;
    double increments = 0.5;
    double frequency;

    public Radio(double frequency) {
        if (frequency >= minFrequency && frequency <= maxFrequency) {

            this.frequency = frequency;
        } else {
            frequency = 80.0;
        }

    }
    public Radio(){
        frequency=80.0;
    }
    
    public void upDial(){
        if (frequency + increments > maxFrequency){
            frequency = minFrequency;
        }
        else
        {
            frequency+=increments;
        }
    }

    public void downDial(){
        if (frequency - increments < minFrequency){
            frequency = maxFrequency;
        }
        else
        {
            frequency-=increments;
        }
    }

    void mostrarDisplay(){
        System.out.printf("Frecuencia %s Mhz\n",frequency);
    }



}
