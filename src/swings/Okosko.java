package swings;

//шаблон свинг окошка
import javax.swing.*;
import java.awt.*;

class Okoshko extends JFrame {
    String title;
    JPanel pnl = new JPanel();

    public Okoshko(String title) {
        super(title);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(1040, 150);
        add(pnl);

    }


}
