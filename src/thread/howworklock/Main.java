package thread.howworklock;

public class Main {

    public static void main(String[] args) {


        ConcurrencyLockExample lockExample =
                new ConcurrencyLockExample(new Resource());

        Thread myLock = new Thread(lockExample);
        myLock.start();

    }
}
