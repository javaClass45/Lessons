package doubleExtends;

public abstract class OneClass {
    int a = 3;
    String b = "abstract example";

    void oneMethod() {
        System.out.println("OneMethod");
    }

    public OneClass() {
    }

    public OneClass(int a, String b) {
        this.a = a;
        this.b = b;
    }
}
