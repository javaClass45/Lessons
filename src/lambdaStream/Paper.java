package lambdaStream;

public interface Paper {
    default void show() {
        System.out.println("default show()");
    }

}
