package doubleExtends.abstracts;

public class SomeClass extends AbstractClassWithStaticMethods {

    @Override
    public void testPrint(String str) {
        System.out.println("SomeClass " + str);
    }

    @Override
    public void methodOfInterface() {
        System.out.println("methodOfInterface");
    }
}
