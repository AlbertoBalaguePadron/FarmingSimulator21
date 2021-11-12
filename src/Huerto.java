public class Huerto {
    private char buff[];
    private int top = 0;
    private boolean full = false;
    private boolean empty = true;

    public Huerto(int capacity) {
        this.buff = new char[capacity];
    }


    public synchronized void put(char c) throws InterruptedException {
        while (full) {
            wait();
        }
        buff[top] = c;
        top += 1;
        empty = false;
        full = top >= buff.length;
        notifyAll();
    }

    public synchronized char get() throws InterruptedException {
        while (empty) {
            wait();
        }
        char c = buff[--top];
        full = false;
        empty = top <= 0;
        notifyAll();
        return c;
    }


}
