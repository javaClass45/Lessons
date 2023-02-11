package javarush.level8;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class TestData {

    public static void main(String[] args) throws Exception {

        Date dayNow = new Date();

        System.out.println(dayNow);

        LocalDate datka = LocalDate.now();
        System.out.println("datka = " + datka);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        System.out.println("date: " + dateFormat.format(dayNow) );

    }

}
