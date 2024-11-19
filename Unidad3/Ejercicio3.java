import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //vamos a pedir al usuario los datos
        System.out.print("Cantidad de comida diaria (en kilos): ");
        float comidaDiaria =scanner.nextFloat();
        System.out.println("numero de animales");
        int numAnimales = scanner.nextInt();
        System.out.print("Kilos de comida por animal: ");
        float kilosPorAnimal =scanner.nextFloat();

//vamos a comprobar que no dividimos por 0
if(numAnimales==0){
System.out.println("la division no puede ser por 0 ");
}
//vamos a calcular la comida que tenemos
float comidaQueTenemosParacadaAnimal = comidaDiaria/numAnimales;

    if (comidaQueTenemosParacadaAnimal>=kilosPorAnimal)
    {
        System.out.println("disponemos de comida para los animales");
    }
    else
    {
        System.out.println("Hoy se van a quedar con hambre, tocan a "+ comidaQueTenemosParacadaAnimal);

    }

        
    }
}
