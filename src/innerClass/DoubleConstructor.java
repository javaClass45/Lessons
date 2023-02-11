package innerClass;

public class DoubleConstructor implements InnerInterface {
    public DoubleConstructor() {
        System.out.println("construct-DoubleConstructor");
        create();


    }

    public Object create() {
         class Dcons{
             public Dcons() {
                 System.out.println("constr-Dcons");
             }
         }
        return new Dcons();
    }

    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    boolean bool = Boolean.parseBoolean(null);



    public static void main(String[] args) {
        DoubleConstructor doubleConstructor = new DoubleConstructor();
        System.out.println("doubleConstructor.sum(3, 2) = " +
                doubleConstructor.sum(3, 2));
        System.out.println(doubleConstructor.bool);
    }




}



 interface InnerInterface{
    public int sum(int a, int b);

}


