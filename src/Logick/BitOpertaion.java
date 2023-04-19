package Logick;

public class BitOpertaion {
    public static void main(String[] args) {
        int result = 1000;
        for (int i = 0; i < 32; i++) {
            result = result << 1;
            System.out.println(result);
        }
    }
}
