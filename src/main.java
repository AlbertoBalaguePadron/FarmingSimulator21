public class main {

    public static void main(String[] args) {
        int Cantidad = 10;
        int TiempoEspera = 2000;

        Huerto huerto = new Huerto(10);
        Jardinero Paco = new Jardinero(huerto, Cantidad, TiempoEspera);
        Consumidor Cliente = new Consumidor(huerto, Cantidad, TiempoEspera);

        Paco.setPriority(Thread.MAX_PRIORITY);
        Cliente.setPriority(Thread.NORM_PRIORITY);

        Paco.start();
        Cliente.start();

    }

}
