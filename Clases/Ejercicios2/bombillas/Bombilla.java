class Bombilla {
    private boolean encendida;
    private static boolean interruptorGeneral = true;

    public boolean estaEncendida() {

        String estadoIndividual = encendida ? "encendida" : "apagada";
        String estado = interruptorGeneral && encendida ? "encendida" : "apagada";
        System.out.println("La bombilla esta: " + estado +" pero su interruptor individual es " + estadoIndividual);
        return interruptorGeneral && encendida;
    }

    public void enciendeBombilla(boolean encender) {
        encendida = encender;

    }
    public static void encenderInterruptorGeneral(boolean encender)
    {
        interruptorGeneral = encender;
        estadoInterruptorGeneral();
    }
    public static boolean estadoInterruptorGeneral(){
        String estado = interruptorGeneral?"encendido":"apagado" ;
        System.out.println("interruptor general a "+ estado);
        return interruptorGeneral;
    }

}