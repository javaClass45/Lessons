package thread;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SyncThread_II {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        new Worker().mainWork();

        }
    }

class Worker {
    Random random = new Random();

    Object lock1 = new Object();
    Object lock2 = new Object();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new LinkedList<>();


    public void addToList1() {
        synchronized (lock1) {
            for (int i = 0; i < 1000; i++ ) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list1.add(random.nextInt(100));
            }
        }
    }

    public void addToList2() {
        synchronized (lock2) {
            for (int i = 0; i < 1000; i++ ) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list2.add(random.nextInt(100));
            }
        }
    }

    public void work() {
        addToList1();
        addToList2();

    }

    public void mainWork() throws InterruptedException {
        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        long after = System.currentTimeMillis();
        System.out.println("Program took " + (after - before) + "ms to run");
        System.out.println("list1 " + list1.size());
        System.out.println("list2 " + list2.size());


    }

}


