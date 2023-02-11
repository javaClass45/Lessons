package polimorph;

import java.util.ArrayList;
import java.util.List;

public class ExamplePM {
    public static void main(String[] args) {

        List<Super> list = new ArrayList<>();
        list.add(new A());
        list.add(new B());
        list.add(new C());
        list.add(new D());


        for (Super ob : list) {
            ob.prn();
            System.out.println("ob.getClass() = " + ob.getClass());
            ob.inter();
        }


    }

}

class A extends Super{
    public int a = 10;

    @Override
    public void prn() {
        System.out.println(a);
    }

    @Override
    public void inter() {
        System.out.println("class A implements method inter");
    }
}

class B extends Super{
    public double b = 0.2;

    public void prn() {
        System.out.println(b);
    }
    @Override
    public void inter() {
        System.out.println("class B implements method inter");
    }
}

class C extends Super{
    public long c = 3000000000000000000L;

    public void prn() {
        System.out.println(c);
    }
    @Override
    public void inter() {
        System.out.println("class C implements method inter");
    }
}

class D extends Super{
    public String  s = "stroka String";

    public void prn() {
        System.out.println(s);
    }
    @Override
    public void inter() {
        System.out.println("class D implements method inter");
    }
}

 abstract class Super implements Inter{
    abstract void prn();

}

interface Inter {
    void inter();
}