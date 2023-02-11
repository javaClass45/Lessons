package dialog;

import javax.swing.*;

/**
 * Created by Anton on 11.07.16.
 */
public class Dialog {

    public static void main(String[] args) {
        System.out.println("System.out.println - вывод");
        String inputDialog = JOptionPane.showInputDialog("What name?");
        JOptionPane.showMessageDialog(null,inputDialog);
        JOptionPane.showInternalMessageDialog(null,
                "showInternalMessageDialog",
                "showInternalMessageDialog",JOptionPane.PLAIN_MESSAGE);


        //System.out.println(inputDialog);

        JOptionPane.showInputDialog("WTF");

        System.exit(0);





    }


}
