public class Huerto {
    private String buff[];
    private int top = 0;
    private boolean full = false;
    private boolean empty = true;

    public Huerto(int capacity) {
        this.buff = new String[capacity];
    }


    public synchronized void Plantar(String verdura) throws InterruptedException {
        while (full) {
            wait();
        }
        buff[top] = verdura;
        top += 1;
        empty = false;
        full = top >= buff.length;
        notifyAll();
    }

    public synchronized String Comprar() throws InterruptedException {
        while (empty) {
            wait();
        }
        String c = buff[--top];
        full = false;
        empty = top <= 0;
        notifyAll();
        return c;
     }


}
