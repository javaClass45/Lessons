package thread.joinsleep;

import static java.lang.System.out;
import static java.util.stream.IntStream.rangeClosed;

public final class Runner {

    private static final int FNFT = 1;
    private static final int TNFT = 500;
    private static final int FNST = 501;
    private static final int TNST = 1000;
    private static final String TEMPLATE_MSG = "%s : %d \n";

    public static void main(String... args) throws InterruptedException {

        final TaskSummingNumbers firstTask = new TaskSummingNumbers(FNFT, TNFT);
        final Thread firstThread = new Thread(firstTask);
        firstThread.start();

        final TaskSummingNumbers secondTask = new TaskSummingNumbers(FNST, TNST);
        final Thread secondThread = new Thread(secondTask);
        secondThread.start();
//        sleepTask();

        joinTask(firstThread, secondThread);
        int resultNumber = firstTask.getResultNumber() + secondTask.getResultNumber();
        printThreadNN(resultNumber);
    }


    private static void printThreadNN(final int number) {
        out.printf(TEMPLATE_MSG, Thread.currentThread().getName(), number);
    }



    private static void startThread(final Runnable runnable) {
        var thread = new Thread(runnable);
        thread.start();
    }


    private static void sleepTask() throws InterruptedException {
        Thread.sleep(100);

    }

    private static void joinTask(final Thread... threads) throws InterruptedException {
        for (final Thread thread : threads) {
            thread.join();
        }


    }




//---------------------------CLASS-----------------------------------------
    private static final class TaskSummingNumbers implements Runnable {
        private static final int IVRN = 0;
        private final int fromNumber;
        private final int toNumber;
        private int resultNumber;

        public TaskSummingNumbers(final int fromNumber,final int toNumber) {
            this.fromNumber = fromNumber;
            this.toNumber = toNumber;
            this.resultNumber = IVRN;
        }

        @Override
        public void run() {
            rangeClosed(this.fromNumber, this.toNumber)
                    .forEach(i -> this.resultNumber += i);
           printThreadNN(this.resultNumber);
        }

        public int getResultNumber() {
            return this.resultNumber;
        }
    }
//---------------------------CLASS-----------------------------------------

}
