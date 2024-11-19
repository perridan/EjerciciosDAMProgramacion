/*Escribe un programa que solicite al usuario la calificación obtenida en la prueba (número 
entero positivo). Si el número es >= 5, se imprime por pantalla “Se ha aprobado la prueba”, en otro caso se 
imprime “No se ha aprobado la prueba”. 
Utiliza el operador ternario.*/

//Daniel Recha

// public class Prueba{   
//   public static void main(String() args){  
//   Scanner miEscaner = new Scanner(System.in);  
//   System.out.println("Introduce un número entero");     
//   numEntradaInt = miEscaner.nextInt();  
//   System.out.println("El número entero introducido es: "+numEntradaInt); 
//   } 
//   }

import java.util.Scanner;
public class Ejercicio5{   
  //a su vez yo le he cambiado el nombre de la clase para que coincida con el nombre de mi archivo.java

  public static void main(String[] args){  
  /*en parametro del método main se le pasa un array de strings 
  los arrays se declaran con corchetes [] y no con parentesis() */
  Scanner miEscaner = new Scanner(System.in);  
  System.out.println("Introduce un número entero");     
  int numEntradaInt = miEscaner.nextInt();  
  //en esta linea la variable numEntradaInt no estaba inicializada
  //faltaba declararle el tipo int al principio
  System.out.println("El número entero introducido es: "+numEntradaInt); 
 
} 
  }
