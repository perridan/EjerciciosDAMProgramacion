

public class Ejercicio11B {

public static void main(String[] args) {
String cadenaString = "Hoy voy a pasármelo bien";
int position = cadenaString.indexOf(" ");
String cadenaString2 = cadenaString.substring(0, position+1);
System.out.println(cadenaString2);

}

}