package patterns.producer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Producer {
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
    private static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();


    }//psvm

    private static void produce() throws InterruptedException {

        while (true) {
            queue.put(random.nextInt(100));
        }
    }


    private static void consumer() throws InterruptedException {

        while (true) {
            Thread.sleep(100);
            if (random.nextInt(10) == 5) {
                System.out.println("queue.take() = " + queue.take());
                System.out.println("queue.size() = " + queue.size());
            }
        }
    }


}

