package innerClass;

import java.util.ArrayList;

public class InnerToInner {
    public ArrayList<InnerToInner> createInner(int count) {
        ArrayList<InnerToInner> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            final int number = i;
            result.add(new InnerToInner(){
                int pNumber;
                {
                    pNumber = number;
                }
            });
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new InnerToInner().createInner(5));

    }

}
