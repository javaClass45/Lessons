package thread;

public class TwoThread {

    static int volume = 0;
    static volatile boolean isReady = false;


   static Thread threadOne = new Thread(new Runnable() {
        @Override
        public void run() {
            volume = 41;
            isReady = true;

        }
    });


    static Thread threadTwo = new Thread(new Runnable() {
        @Override
        public void run() {
            if(isReady) {
                System.out.println(volume);

            }

        }
    });

    public static void main(String[] args) {

        threadTwo.start();
        threadOne.start();

    }


}
