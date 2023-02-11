package collections.CollectionsMap;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurentHM {

    public static void main(String[] args) {


        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Anton");
        map.put(2, "Oleg");
        map.put(3, "Pjetro");
        map.put(4, "Nikolaus");
        map.put(5, "Sergej");

        System.out.println(map);

        Runnable runnable1 = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer i = iterator.next();
                System.out.println(i + " : " + map.get(i));

            }
        };

        Runnable runnable2 = () -> {

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(6, "Lena");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(map);
    }

}
