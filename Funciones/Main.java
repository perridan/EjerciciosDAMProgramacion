import java.util.Scanner;

public class Main {

    static void eco(String pcadena, int pNum) {
        pNum= pNum+4;
        for (int i = 0; i < pNum; i++) {
            System.out.println(pcadena);
        }
    }

    public static void main(String[] args) {
        Init();
    }

    private static void Init() {
        String cadena = "";
        int num = 1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        cadena = entrada.next();

        System.out.println("Introduce numero");
        num = entrada.nextInt();
        eco(cadena, num);
        eco(cadena, num*2);
        entrada.close();
    }
}
