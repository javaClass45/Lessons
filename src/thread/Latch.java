package thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Latch {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 4; i++) {
            executorService.submit(new Processor(countDownLatch));
        }

        executorService.shutdown();
         countDownLatch.await();
        System.out.println("Latch open-thead is proceeding!");

    }


}


class Processor implements Runnable {
    private CountDownLatch countDownLatch;

    public Processor(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("-- 3sec --");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        countDownLatch.countDown();
    }
}
