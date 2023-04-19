package ThrowExeption;

public class TryReturn {
    public static void main(String[] args) {
/*        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Ahtung!!!! NullPointerException");
            return ;
//            System.exit(0);

        } finally {
            System.out.println("!!! finally !!! ");
        }*/


        try {
            //            return ;
            System.exit(0);
        } catch (NullPointerException e) {
            System.out.println("Ahtung!!!! NullPointerException");

        } finally {
            System.out.println("!!! finally !!! ");
        }



    }
}
