public class main {

    public static void main(String[] args) {
        int Cantidad = 10;
        int TiempoEspera = 2000;

        Huerto huerto = new Huerto(10);
        Jardinero Paco = new Jardinero(huerto, Cantidad, 200);
        Consumidor Cliente = new Consumidor(huerto, Cantidad, 20000);


        Paco.start();
        Cliente.start();

    }

}
