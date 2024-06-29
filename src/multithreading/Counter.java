package multithreading;

public class Counter {
    private int i = 0;

    public int increment() {
        return i = i + 1;
    }

//    public synchronized int increment() {
//        return i = i + 1;
//    }

    public int getCounter() {
        return i;
    }
}
