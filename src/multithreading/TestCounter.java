package multithreading;

public class TestCounter {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        int REPEAT = 10000000;
        Runnable r = () -> {
            for (int i = 0; i < REPEAT; i++)
                c.increment();
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

        // When we invoke the join() method on a thread, the calling thread goes into a waiting state.
        // It remains in a waiting state until the referenced thread terminates.
        t1.join();
        t2.join();

        int anomaly = (2 * REPEAT) - c.getCounter();
        double percent = ((double) anomaly * 100 / (2 * REPEAT));
        System.out.println("\nLost updates: " + anomaly + "; % = " + percent);
    }
}
