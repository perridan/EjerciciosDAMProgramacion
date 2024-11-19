
//Practica Daniel Recha 

public class Ejercicio6 {

    public static void main(String[] args) {
        int aleatorio = (int) (Math.random() * 100);
        System.out.println("Aquí tienes un numero aleatorio: " + aleatorio
                + " el metodo Math.random devuelve un double entre 0 y 1 pero si lo multiplicas por el numero que quieres como maximo y lo casteas, a int te da el un numero aleatorio");

        // cacharreo con API de la hora actual
        java.time.LocalTime horaActual = java.time.LocalTime.now();

        System.out.println("hora actual es: " + horaActual);

    }

}