import java.util.Scanner;

public class Swich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce algo");
        String hola = scanner.nextLine();

        switch (hola) {
            case "hello":
                System.out.println("dijiste hola");
                break;
            case "goodbye":
                System.out.println("dijiste adios en ingles");
                break;
            case "hola":
                System.out.println("dijiste hola en español");
                break;
            case "adios":
                System.out.println("dijiste adios en español");
                break;
            default:
                System.out.println("pero que digiste?");
                break;
        }

    }
}
