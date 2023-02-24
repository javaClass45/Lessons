package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Избавляемся от меток
Метод isSubstringPresent возвращает true, в случае если строка
 substring является подстрокой строки string, иначе false.
*/

public class LabelLess {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter line:");
        String string = reader.readLine();
        System.out.println("enter subline:");
        String substring = reader.readLine();

        if (isSubstringPresent(substring, string)) {
            System.out.println("String: \n"
                    + substring
                    + "\nis present in the string: \n"
                    + string);
        } else {
            System.out.println("String: \n"
                    + substring
                    + "\nis not present in the string: \n"
                    + string);
        }
    }

    static boolean isSubstringPresent(String substring, String string) {
        return string.contains(substring);

    }
}
