package innerClass;

public class InnerThread {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            new MyThread(i).start();
            System.out.print(i + " ");
        }

    }




}

class MyThread extends Thread {
    public int id;

    public MyThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("АШИПКА!!!");
        }
        System.out.println("thread - " + id);
    }
}
