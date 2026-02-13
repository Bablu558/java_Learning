
class Counter {

    int count = 10;

    public synchronized void decrement() {
        count--;
        System.out.println(
            Thread.currentThread().getName() +
            " decreased count to: " + count
        );
    }
}

class MyTask implements Runnable {

    Counter counter;

    MyTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            counter.decrement();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class SynchronizedP {

    public static void main(String[] args) {

        Counter counter = new Counter();
        MyTask task = new MyTask(counter);

        Thread t1 = new Thread(task, "Thread-A");
        Thread t2 = new Thread(task, "Thread-B");

        t1.start();
        t2.start();
    }
}
