package doubleExtends;

public class Main {
    public static void main(String[] args) {
        ThreeClass threeClass = new ThreeClass();
        threeClass.oneMethod();
        threeClass.twoMethod();
        FourClass fourClass = new FourClass();
        fourClass.oneMethod();

        OneClass oneClass = new OneClass() {
            @Override
            void oneMethod() {
                super.oneMethod();
            }
        };

        oneClass.oneMethod();
        System.out.println("oneClass.b = " + oneClass.b);
        System.out.println("TwoClass.c = " + TwoClass.c);


    }
}
