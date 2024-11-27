import java.util.Scanner;
import rechautils.*;

public class CuentaBancaria {

    int numerodecuenta;
    int saldo;
    String titular;

    public CuentaBancaria(int numerodecuenta, int saldo, String titular) {
        this.numerodecuenta = numerodecuenta;
        this.saldo = saldo;
        this.titular = titular;

    }

    void depositar(int cantidad) {
        saldo += cantidad;
        System.out.printf("hemos añadido %d el saldo actual es %d", cantidad, saldo);
    }

    void retirada(int cantidad) {
        if (saldo - cantidad < 0) {
            System.out.println("no se puede retirar dinero de una cuanta vacia");
            retirada(Validators.intValidado(new Scanner (System.in)));
        } else {
            saldo -= cantidad;
            System.out.printf("hemos retirado %d el saldo actual es %d", cantidad, saldo);

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria(444415154, 100, "Daniel");
       System.out.println("introduce la cantidad a depositar");
        cuenta.depositar(Validators.intValidado(scanner));

        System.out.println("introduce la cantidad a retirar");
        cuenta.retirada(Validators.intValidado(scanner));

    }

}