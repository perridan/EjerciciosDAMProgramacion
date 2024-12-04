class Bombilla {
    private boolean encendida;
    private static boolean interruptorGeneral;

    public boolean estaEncendida() {

        String estado = interruptorGeneral && encendida ? "encendida" : "apagada";
        System.out.println("La bombilla esta: " + estado);
        return interruptorGeneral && encendida;
    }

    public void enciendeBombilla(boolean encender) {
        encendida = encender;

    }
    public static void encenderInterruptorGeneral(boolean encender)
    {
        interruptorGeneral = encender;
    }
    public static boolean estadoInterruptorGeneral(){
        
        return interruptorGeneral;
    }

}