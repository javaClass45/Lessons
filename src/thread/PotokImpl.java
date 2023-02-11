package thread;

public class PotokImpl {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            System.out.println("start");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("10000 ms ");
        };
        Thread thread = new Thread(runnable);
        thread.start();

    }


}
