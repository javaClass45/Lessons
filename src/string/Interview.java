package string;

public class Interview {
    public static void main(String[] args) {

        String a = "hello";
        String d1 = "he";
        String d2 = "llo";
        String d = d1 + d2;
        System.out.println(a == d);
        System.out.println(a.equals(d));

        String b = "he" + "llo";
        System.out.println(a == b);


    }
}
