class HabitacionBombillas {
    public static void main(String[] args) {
        Bombilla bombilla1 = new Bombilla();
        Bombilla bombilla2 = new Bombilla();
        Bombilla bombilla3 = new Bombilla();
        bombilla1.enciendeBombilla(true);
        bombilla1.estaEncendida();
        bombilla2.estaEncendida();
        bombilla3.enciendeBombilla(true);
        bombilla3.estaEncendida();
        Bombilla.encenderInterruptorGeneral(false);
        Bombilla.estadoInterruptorGeneral();
        bombilla1.estaEncendida();
        bombilla2.estaEncendida();
        bombilla3.estaEncendida();

    }
}