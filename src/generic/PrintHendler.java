package generic;

public class PrintHendler<T> {
//    private T t;

    public void prn(T t) {
        System.out.print(t);
    }

//    public T getT() {
//        return t;
//    }
//
//    public void setT(T t) {
//        this.t = t;
//    }



    public static void main(String[] args) {

        PrintHendler<String> line = new PrintHendler<>();
        line.prn("new line");
        System.out.println("\n");


        PrintHendler<Integer> intLine = new PrintHendler<>();
        intLine.prn(123456789);
        System.out.println("\n");

        PrintHendler<Double> doubline = new PrintHendler<>();
        doubline.prn(159.23689);
        System.out.println("\n");

        PrintHendler<Character> charLine = new PrintHendler<>();
//        charLine.prn('\u1259');
        int k = 0;
        for (int i = 14; i <= 1000; i++) {
            System.out.print(i + "=> ");
            charLine.prn((char)i);
            System.out.print("   ");
            k++;
            if (k == 10) {
                System.out.println();
                k = 0;
            }
        }

    }


}
