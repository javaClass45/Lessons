package polimorph.geometria;

public class Circle implements Shape {
    String str;
    @Override
    public void draw() {
        str = "drow Circle";
        System.out.println(str);
    }

    @Override
    public void print() {
        str = "print Circle";
        System.out.println(str);
    }

    @Override
    public void     erase() {
        str = "eraze Circle";
        System.out.println(str);
    }
}
