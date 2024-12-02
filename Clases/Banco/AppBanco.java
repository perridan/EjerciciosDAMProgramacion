package Banco;

public class AppBanco {

   public static void main(String args[]) {
        CuentaCorriente c1 = new CuentaCorriente("1525555A", 20);
        c1.muestraInformacion();
        CuentaCorriente.setBanco("PowerBank");
        c1.nombre= "Daniel R";
        c1.setGestor(new Gestor("Ponzi","6666",555));
        c1.ingresar(20);
        c1.muestraInformacion();
        

    }

}
