package patterns.prototype;

public class ProTest {
    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        Prototype clone = prototype.copy();
        clone.setType(Prototype.Type.ONE);
        System.out.println("clone.toString() = " + clone.toString());
    }
}
