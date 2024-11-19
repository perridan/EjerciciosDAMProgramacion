/*Ejercicio 1. Escribe un programa que ayude a un vendedor a calcular el precio de las ventas de 3 de sus 
productos. Teniendo en cuenta estos precios */

//Daniel Recha
import java.util.Scanner;
public class Ejercicio1 {
public static void main (String[] args) {
      //Instaciamos la clase scanner para usarla
    Scanner scanner = new Scanner(System.in);
    //asignamos variables para productos
    float patatas =2.8f;
    float tomates =4.7f;
    float lechugas =2.0f;
    //vamos a solicitar al usuario las cantidades
 System.out.println("¿Cuantos Kg de patatas?");
 float kgPatatas = scanner.nextFloat();
 System.out.println("¿Cuantos Kg de tomates?");
 float kgTomates = scanner.nextFloat(); 
 System.out.println("¿Cuantas Lechugas?");
 int nLechugas = scanner.nextInt();
//calculamos totales
  float totales = (patatas*kgPatatas) + (tomates*kgTomates) + (lechugas *nLechugas) ;
  System.out.println("el total de la compra es "+ totales  +" Euros");
    }
}
