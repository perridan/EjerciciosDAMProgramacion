import java.util.Scanner;

public class SwichNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un numero");
        int hola = scanner.nextInt();

        switch (hola) {
            case 1,2,3->
            {
                System.out.println("No hubo suerte");
            }
            case 4->{
                System.out.println("Ta tocao");
            }
            default->{
                System.out.println("pero que digiste?");
            }
        }

    }
}
