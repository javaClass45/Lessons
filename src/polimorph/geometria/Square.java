package polimorph.geometria;

public class Square implements Shape{
    String str;
    @Override
    public void draw() {
        str = "drow Square";
        System.out.println(str);
    }

    @Override
    public void print() {
        str = "print Square";
        System.out.println(str);
    }

    @Override
    public void erase() {
        str = "eraze Square";
        System.out.println(str);
    }
}
