package thread;

import java.util.Random;
import java.util.concurrent.*;

public class CallFuture {

    private static int intuha;
    private int nonStatic;


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        /*executorService.submit(() -> {
            System.out.println("Thread start");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread finish");
        });
        executorService.shutdown();*/
/*
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread start");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread finish");
            }
        });
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
        */
        Future<Integer> future =
        executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {

                Random random = new Random();
                intuha = random.nextInt(10);
                if (intuha < 5)
                throw new Exception("!!!Exception!!!");
                return intuha;
            }
        });

        executorService.shutdown();

        try {
            System.out.println("future.get() = " + future.get());
            //get дожидается исполнения потока
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }




}
