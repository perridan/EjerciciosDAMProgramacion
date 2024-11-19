import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce un número");
           int numeroEntero = scanner.nextInt();
        String resultado =(numeroEntero>0)? "el numero es positivo":
                          (numeroEntero<0)? "el numero es negativo":
                                            "el numero es cero";
   System.out.println("el número es: "+  resultado) ; 
    scanner.close();
    }
}
