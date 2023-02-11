package string;

public class Mesg {

    static void fun1() {
        String msg = "Hello";
        System.out.println(msg);
        fun2(msg);
        System.out.println(msg);
    }

    static String fun2(String s) {
        s += " World";

        return s;
    }


    public static void main(String[] args) {

        fun1();


    }
}
