package thread.howworklock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyLockExample implements Runnable {

    private final Resource resource;
    private final Lock lock = new ReentrantLock();


    public ConcurrencyLockExample(Resource res) {
        this.resource = res;
    }

    @Override
    public void run() {

        try{
            // ждем максимум 10 секунд, если лок занят
            if (lock.tryLock(10, TimeUnit.SECONDS)) {
                resource.doSomething();
            }
        }catch(InterruptedException | NullPointerException exception){
            exception.printStackTrace();
        }finally{
            lock.unlock();
        }

        resource.doLoggin();// не требуется потокобезопасность
    }
}
