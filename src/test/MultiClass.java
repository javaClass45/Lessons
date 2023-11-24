package test;

public class MultiClass {


    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.method();
        b.method();
    }


}

class A {
    void method() {
        System.out.println("method_A_Class");
    }
}

class B extends A {
    public B() {
       super.method();
        System.out.println("-Construktor B-");
    }

    @Override
    void method() {
        System.out.println("method_B_Class");
    }
}

