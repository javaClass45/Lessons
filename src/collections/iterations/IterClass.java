package collections.iterations;


import javax.swing.*;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class IterClass {

    public static void main(String[] args) throws Exception {

        //new LinkedList<>();
        LinkedList<Integer> integerList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));

        Iterator<Integer> iterator = integerList.iterator();
//        Iterable
        try {

            while (iterator.hasNext()) {
                System.out.println(iterator.next());
                iterator.remove();
                JOptionPane.showMessageDialog(null, iterator.next());
            }
            throw new FileNotFoundException("e FileNotFoundException");
            // throw new RuntimeException("block try RuntimeException");

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "block catch FileNotFoundException");
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("block catch RuntimeException");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("block catch Exception");
            e.printStackTrace();
        }


    }

}
