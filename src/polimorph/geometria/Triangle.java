package polimorph.geometria;

public class Triangle implements Shape {
    String str;
    @Override
    public void draw() {
        str = "drow Triangle";
        System.out.println(str);
    }

    @Override
    public void print() {
        str = "print Triangle";
        System.out.println(str);
    }

    @Override
    public void erase() {
        str = "eraze Triangle";
        System.out.println(str);
    }
}
