package doubleExtends;

public class Main {
    public static void main(String[] args) {
        ThreeClass threeClass = new ThreeClass();
        threeClass.OneMethod();
        threeClass.TwoMethod();
        FourClass fourClass = new FourClass();
        fourClass.OneMethod();

        OneClass oneClass = new OneClass() {
            @Override
            void OneMethod() {
                super.OneMethod();
            }
        };

        oneClass.OneMethod();
        System.out.println("oneClass.b = " + oneClass.b);
        System.out.println("TwoClass.c = " + TwoClass.c);


    }
}
