import javax.management.monitor.Monitor;

public class main {

    public static void main(String[] args) {

        Huerto huerto = new Huerto(20);
        Jardinero Paco = new Jardinero(huerto, 10, 1000);

        Paco.start();


    }

}
