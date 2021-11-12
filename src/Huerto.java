public class Huerto {
    private char buff[];
    private int top = 0;
    private boolean full = false;
    private boolean empty = true;

    public Monitor( int capacity){
        this.buff = new char[capacity];
    }


    public synchronized void put(char c ) throws InterruptedException {
        while (full) {
            wait();
        }
        System.out.println("Añadiendo valor en Top " + top);
        buff[top] = c;
        top += 1;
        empty = false;
        full = top >= buff.length;
        notifyAll();
    }












}
