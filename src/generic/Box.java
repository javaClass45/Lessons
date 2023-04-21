package generic;

public class Box<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }


    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        stringBox.setT("new line");

        System.out.println(stringBox.getT());

        stringBox.setT("second new line");
        System.out.println(stringBox.getT());


    }


}
