package statics;

public class MyProgram {

    public static void main(String[] args) {

        Man vadik = new Man();
        Man pedro = new Man();

        vadik.displayId();
        pedro.displayId();
        System.out.println(Man.counter);

        Man.counter = 9;

        Man gomes = new Man();
        gomes.displayId();
    }


}
