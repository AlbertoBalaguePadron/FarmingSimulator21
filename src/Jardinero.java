public class Jardinero extends Thread {

    private final Huerto buffer;
    private final int procesUnit;
    private final int sleep;
    private double TiempoCrecimiento;
    private String [] Verduras = {
            "lettuce",
            "cabbage",
            "onion",
            "spinach",
            "potato",
            "celery",
            "asparagus",
            "radish",
            "broccoli",
            "artichoke",
            "tomato",
            "cucumber",
            "eggplant",
            "carrot",
            "green bean"};

    public Jardinero(Huerto buffer, int procesUnit, int sleep) {
        this.buffer = buffer;
        this.procesUnit = procesUnit;
        this.sleep = sleep;
    }

    @Override
    public void run() {
        String c;
        int valor;
        String verdura;
        int tiempoC;
        try {
            for (int i = 0; i < procesUnit; i++) {
                valor = (int) (Math.random() * this.Verduras.length);
                verdura = Verduras[valor];
                tiempoC = (int) (Math.random() * this.sleep);
                System.out.println("Se planta => " + verdura + " Y crecrio a => " + tiempoC);
                sleep(tiempoC);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
