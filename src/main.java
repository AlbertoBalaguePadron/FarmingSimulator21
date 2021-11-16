import javax.management.monitor.Monitor;

public class main {

    public static void main(String[] args) {

        Huerto huerto = new Huerto(10);
        Jardinero Paco = new Jardinero(huerto, 20, 1000);
        Consumidor Cliente = new Consumidor(huerto, 18, 2000);

        Paco.start();
        Cliente.start();

    }

}
