package string;

import javax.swing.*;
import java.util.Arrays;


public class MyString {


    public void myString() {

        StringBuilder builder = new StringBuilder();
        JOptionPane.showMessageDialog(null,builder.capacity());
        String newStr = new String("вариант, принимающий аргумент Locale," +
                " и используют его правила локализации для преобразования" +
                " строки в верхний или нижний регистр. ");


        JOptionPane.showMessageDialog(null,"newStr.getClass() = "
                + newStr.getClass());

        String str = "вариант, принимающий аргумент Locale, и используют его правила локализации для преобразования" +
                " строки в верхний или нижний регистр. ";

        JOptionPane.showMessageDialog(null,"(str.length()*2) = " + (str.length() * 2));
 
        byte[] bytesArr = str.getBytes();


        System.out.println("bytesArr = " + Arrays.toString(bytesArr));

        char[] chars = str.toCharArray();

        int size = 0;
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            size = size + 2;
            sum = sum + size;
            builder.append(chars[i]);

        }

        JOptionPane.showMessageDialog(null,"builder.capacity() = "
                + builder.capacity());

        JOptionPane.showMessageDialog(null,"sum = " + sum);
        System.out.println(builder);
        System.exit(0);

    }
}
