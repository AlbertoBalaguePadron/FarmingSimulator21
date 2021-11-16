import org.w3c.dom.Text;

public class Consumidor extends Thread {
    private Huerto buffer;
    private int exprocesUnit;
    private int sleep;

    public Consumidor(Huerto buffer, int exprocesUnit, int sleep) {
        this.buffer = buffer;
        this.exprocesUnit = exprocesUnit;
        this.sleep = sleep;
    }


    @Override
    public void run() {
        int tiempoC;
        try {

            for (int i = 0; i < exprocesUnit; i++) {
                String texto = buffer.Comprar();
                System.out.println("Comprada la verdura " + texto);
                tiempoC = (int) (Math.random() * this.sleep);
                sleep(tiempoC);

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
