package doubleExtends;

public class TwoClass extends OneClass {


    public static int c = 10;
    int d = 20;


    void twoMethod() {
        System.out.println("TwoMethod");
    }

    public static void main(String[] args) {
        System.out.println((TwoClass.c));
    }
}
