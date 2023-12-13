package doubleExtends.abstracts;

public abstract class AbstractClassWithStaticMethods implements InterfaceForAbstractClass {
    public abstract void testPrint(String str);
    public static void main(String[] args) {
        System.out.println("AbstractClassWithStaticMethods");

        methods.testPrint("static ACWSM");
        methods.methodOfInterface();
        SomeClass someClass = new SomeClass();
        someClass.testPrint("testPrint extends ACWSM");
        someClass.methodOfInterface();

    }

    static AbstractClassWithStaticMethods methods = new AbstractClassWithStaticMethods() {
        @Override
        public void methodOfInterface() {
            System.out.println("methodOfInterface in the static AbstractClassWithStaticMethods");
        }

        @Override
        public void testPrint(String str) {
            System.out.println(str);
        }
    };


}

