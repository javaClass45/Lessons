package thread;

public class MyFirstThread extends Thread {
    @Override
    public void run() {
        System.out.println("Выполнен поток " + getName());

    }

//    public static void main(String[] args) {
//
//        MyFirstThread myFirstThread = new MyFirstThread();
//        myFirstThread.start();
//
//
//    }


}
