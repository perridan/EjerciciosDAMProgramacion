public class Ejercicio2 {
    public static void main(String[] args) {
        int[] enteros = {1,2,3,4,5,6,7,8,9,10};
        int[] enteros2= enteros; 
        int[] enteros3= enteros;
        System.out.printf("las referencias de los arrays son: %s, %s, %s", enteros, enteros2, enteros3);
    }
}
