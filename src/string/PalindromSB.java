package string;

import javax.swing.*;

public class PalindromSB {

    public void seversStrBuilder() {
        //аргентинаманитнегра

        String palindrom = "nanomēmatamēmonan";
        StringBuilder builder = new StringBuilder(palindrom);

        builder.reverse();

        if (builder.toString().equals(palindrom)){
            JOptionPane.showMessageDialog(null,"palindrome - " + builder);
        } else {
            JOptionPane.showMessageDialog(null,"not palindrome - " + builder);
        }




    }
}
