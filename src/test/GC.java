package test;

public class GC {
    @Override
    public void finalize() {
        System.out.println("finalize");
    }
    public static void main(String[] args) {
 GC test = new GC();

        for (int i  = 0; i < 10; i++) {
            System.out.print(i + " ");
            test.finalize();

        }

    }
}
