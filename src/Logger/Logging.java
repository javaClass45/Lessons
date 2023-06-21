package Logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Logging {

    public static void main(String[] args) {
        Logger myLog = Logger.getLogger(Logging.class.getName());
        myLog.setLevel(Level.INFO);
        ConsoleHandler handler = new ConsoleHandler();
        myLog.addHandler(handler);
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        handler.setFormatter(simpleFormatter);
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            count++;
            if (count == 5000) myLog.info("count = " + count);
        }
        myLog.info("END PROGRAM: count = " + count);
    }
}
