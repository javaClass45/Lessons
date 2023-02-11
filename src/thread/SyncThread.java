package thread;

public class SyncThread {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        SyncThread syncThread = new SyncThread();

         syncThread.doWork();
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
                System.out.println("thread1 counter = " + counter);
            }
        });
             Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
                System.out.println("thread2 counter = " + counter);
            }
        });

             thread1.start();
             thread2.start();

             thread1.join();
             thread2.join();

        System.out.println("thread1+2 counter = " + counter);

    }
//synchronized - выполняет роль МОНИТОРА - пускает только один поток в метод
    // исключает состояние ГОНКИ
    private synchronized void increment() {
        counter = counter + 1;
    }
}

