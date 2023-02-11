package patterns.prototype;

public class Prototype implements Copyable {
    private Type type;

    public enum Type {
        ONE,
        TWO
    }

    public Prototype copy() {
        Prototype prototype = new Prototype();
        return prototype;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "type=" + type +
                '}';
    }
}

interface Copyable {
    Copyable copy();
}


