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
        try {
            for (int i = 0; i < procesUnit; i++) {
                TiempoCrecimiento = ((int) (Math.random() * 100));
                sleep((int) (Math.random() * this.sleep));
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
