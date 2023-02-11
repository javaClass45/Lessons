package calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class testNumSum {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        try {
            String str;
            System.out.println("Надо ввести число");
            while (!(str = reader.readLine()).equals("N")){
                sum += Integer.parseInt(str);
                System.out.println("еще раз...(или N)");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sum);

    }
}
