package fordowhile;

import static javax.swing.JOptionPane.*;

/**
 * Created by Anton on 12.07.16.
 */
public class Class3 {
    public static void main(String[] args) {
        int sum = 0;
        int i;
        int max = 100;

//        for (i = 0; sum+i < max; i++) {
//            sum+=i;
//            System.out.println("i="+ i + "; " + "sum=" + sum);
//        }

        String input = showInputDialog("Веди число от 1 до 3:");
        int inp = Integer.parseInt(input);
        switch (inp) {
            case 1:
                System.out.println("1");
                showMessageDialog("message!!!ONE");
                break;
            case 2:
                System.out.println("2");
                showMessageDialog("message!!!DVA");
                break;
            case 3:
                System.out.println("3");
                showMessageDialog("message!!!tri");
                break;
            default:
                showMessageDialog("Не то число!! ОШИБКА!!");
        }
        System.exit(0);
    }

    /**
     * @param s
     */
    private static void showMessageDialog(String s) {
        System.out.println(s);

    }


}
