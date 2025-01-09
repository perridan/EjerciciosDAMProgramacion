public class Ejercicio3 {
    public static void main(String[] args) {
        int[] aleatorios = new int[10];
        int suma=0;

        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = (int) Math.floor(Math.random() * 100) + 1;
            System.out.printf("el numero aleatorio para la posicion %d, es %s \n", i, aleatorios[i]);
            suma+= aleatorios[i];
        }
   
        System.out.printf("la suma de todos los numeros aletorios es %d", suma );

    }

}
