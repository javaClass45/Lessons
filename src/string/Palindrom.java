package string;

import java.util.Arrays;

public class Palindrom {

    public void palindrom() {
        //аргентинаманитнегра

        String palindrome = "anna";
        char[] charArr = palindrome.toCharArray();
        char[] str = new char[charArr.length];
        int j = 0;

        for (int i = charArr.length-1; i >= 0; i--) {
            str[j] = charArr[i];
            if (str[j] != charArr[j]) {
                System.out.println("not palindrome");
                return;
            }
            j++;
        }
        System.out.println(" palindrome");

    }
}
