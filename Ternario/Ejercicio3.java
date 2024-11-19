import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[]args)
{
        Scanner scanner = new Scanner(System.in);
//introducimos los números
System.out.println("Introduce la temperatura en grados celsius");
int temperatura = scanner.nextInt();
//vamos a calcular el algoritmo
String resultado = (temperatura>=30)?"Hace calor":(temperatura<10)?"Hace Mucho frío":"Hace frío";
System.out.println(resultado) ; 
    scanner.close();
}
}
