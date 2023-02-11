package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            executorService.submit(new Work(i));
        }
            executorService.shutdown(); // приступили к выполнению засабммиченых заданий
            System.out.println("all tasks submitted");
            executorService.awaitTermination(1, TimeUnit.DAYS);// сколько ждать пока наши
            // потоки выполнятся

    }
}

class Work implements Runnable {

    private int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10000);// имитация сложной работы
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Working 10 sec: thread id= " + id);
    }
}
