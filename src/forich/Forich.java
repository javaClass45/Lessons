package forich;

import java.util.Arrays;

public class Forich {
    public static void main(String[] args) {

        String str = "qwertgfdsazxcvb123mnbvfreds";
        for (char c : str.toCharArray()) {
            System.out.print(c + " - ");
        }
        System.out.println("\n");
        char[] chArr = str.toCharArray();
        int i = 0;
        for (char ca: chArr) {

            System.out.print(ca + " " + i++ + " ");
        }
        System.out.println("\n" +i + " simvolov");
        System.out.println("length chArr = " + chArr.length);
        System.out.println(Arrays.toString(chArr));//печатаем массив "правильно"

        for (Object o : chArr) {
            System.out.print(o.toString());
        }

    }
}
