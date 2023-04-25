package Logger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

 class Main {

    public static void main(String[] args) {
        Logger logger = new Logger();
        String dateStr = "2023-04-25";

        logger.write("Starting of an important process");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date result = simpleDateFormat.parse(dateStr);
            logger.write(result.toString());
        } catch (ParseException e) {
            logger.write("ERROR!");
        }

logger.write("Completion of an important process ");

    }


    static class Logger {
        public void write(String text) {
            System.out.println(text);
        }
    }
}