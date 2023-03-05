package consolecalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class CCalendar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int selectedYear = scn.nextInt();

        int selectedMonth = 0;

        while (true) {
            System.out.println("Enter Month (1-12) : ");
            int k = scn.nextInt();

            if (k >= 1 && k <= 12) {
                selectedMonth = k - 1;
                break;
            } else {
                System.out.println("!!! Month number entered incorrectly !!!");
            }
        }

        scn.close();

        //текущая дата сегодня
        Calendar cal = new GregorianCalendar();
        int cDay = cal.get(Calendar.DATE);
        int cMonth = cal.get(Calendar.MONTH);
        int cYear = cal.get(Calendar.YEAR);
        //   System.out.printf("cDay - %d; cMonth - %d; cYear - %d;\n", cDay, cMonth + 1, cYear);

        GregorianCalendar gCal =
                new GregorianCalendar(selectedYear, selectedMonth, 1);// gayOfMonth = 1 !!!
        int days = gCal.getActualMaximum(Calendar.DATE);
        //  System.out.println("days -" + days);

        int startInWeek = gCal.get(Calendar.DAY_OF_WEEK);

        //  System.out.println("startInWeek -" + startInWeek);

        gCal = new GregorianCalendar(selectedYear, selectedMonth, days);
        // количество недель Calendar.WEEK_OF_MONTH выдает СТРАННО!
        // int totalweeks = getActualMaximum(gCal);
        int totalweeks = startInWeek == 7 ? getActualMaximum(gCal) + 1 : getActualMaximum(gCal);
        //  System.out.println("totalweeks -" + totalweeks +"\n");
        if (totalweeks == 7 && days <= 30 ) totalweeks = 6; //без этого - некрасиво (2023-4/2056-1)
        if (days == 31 && startInWeek > 5) totalweeks = 6; //без этого - некрасиво (1980-1)
        if (days == 31 && startInWeek <= 5) totalweeks = 5; //без этого - некрасиво (1980-1)
        if (days == 30 && startInWeek <= 6) totalweeks = 5; //без этого - некрасиво (1980-1)
        if (days <= 29) totalweeks = 5; //без этого - некрасиво (2020-2)
        if (days == 28 && startInWeek == 1) totalweeks = 4; //без этого - некрасиво (2025-2)

        // System.out.println("totalweeks(!) -" + totalweeks +"\n");

        int count = 1;  // счетчик дней
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println("     " + month[selectedMonth] + " - " + selectedYear);
        System.out.println("su|mo|tu|we|th|fr|sa");
        //  System.out.println("--+--+--+--+--+--+--");
        for (int i = 1; i <= totalweeks; i++) {

            for (int j = 1; j <= 7; j++) {
                if (count < startInWeek || (count - startInWeek + 1) > days) {
                    System.out.print("__");
                    System.out.print(" ");
                } else {
                    if (cDay == (count - startInWeek + 1)
                            && cMonth == selectedMonth
                            && cYear == selectedYear) {
                        System.out.print("'" + getDay(count - startInWeek + 1) + "'");
                        // System.out.print(" ");
                    } else {
                        System.out.print(getDay(count - startInWeek + 1));
                        System.out.print(" ");
                    }
                }
                count++;
            }
            System.out.println();   //  to next line
        }
    }

    private static int getActualMaximum(GregorianCalendar gCal) {
        return gCal.getActualMaximum(Calendar.WEEK_OF_MONTH)+1;
    }

    private static String getDay(int i) {
        String sDate = Integer.toString(i);
        if (sDate.length() == 1) {
            sDate = "0" + sDate;
            return sDate;
        } else {
            return sDate;
        }

    }
}
