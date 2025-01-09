import java.util.Arrays;
import  java.util.Scanner;
import rechautils.Validators;
public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] decimales= new double[5];
        for (int i = 0; i < decimales.length; i++) {
            System.out.println("introuce 5 números decimales ");
           decimales[i] = Validators.doubleValidados(scanner);
            
        }
        System.out.println("los números que has introducido son " + Arrays.toString(decimales));
    }

}
