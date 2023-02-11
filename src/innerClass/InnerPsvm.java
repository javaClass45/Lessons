package innerClass;

public class InnerPsvm {
    public String outer = "outer";


    public static void main(String[] args) {
        System.out.println("new InnerPsvm().outer = "
                + new InnerPsvm().outer);
        InnerPsvm ip = new InnerPsvm();

        Psvm.field = 2;
        System.out.println("Psvm.field = " + Psvm.field);


    }


    static class Psvm {
        static int  field;
        public int  newField;
        public static void main(String[] args) {
            System.out.println("new InnerPsvm().outer = "
                    + new InnerPsvm().outer);
            Psvm.field = 3;
            System.out.println("field = " + field);
        }

    }


}

