public class Variables
{
public static void main(String[]args)
{
final int constante = 3; //esta variable permanecera constante.
char myLetter = 'D'; //es un cararcter
String texto = "texto" ; //un string es un array de caracteres.
float valorDecimal = 3.25f; //valores decimales de coma flotante
boolean myBool = true; //valor boleano.

System.out.print(2024); //Numeros pueden ir sin "comillas"
System.out.println(constante);
System.out.println(myLetter);
System.out.println(texto);
System.out.println(valorDecimal);
System.out.println(myBool);

int a , b, c ; //declaro 3 variables en la misma linea. 
a = b = c = 5; // asigno el valor a las 3 variables en la misma linea.
System.out.println(a + b + c); // puedo operar en el println los valores no se guardan en ninguna variable.
c = a+b; //sumo 2 valores.
System.out.println(c);
c++; //incremento el valor de la variable.
System.out.println(c);
System.out.println("tambien puedo hacer otros calculos matemáticos.");
System.out.println("el resultado de la resta es "+(int) (12 - 5) );
System.out.println("el resultado de la multiplicación es "+(int) (5 * 5) );
System.out.println("el resultado de la División es "+(int) (20 / 5) );





}
}

/* comentarios multilineas pueden ir así
con esta esta forma
*/