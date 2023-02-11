package ThrowExeption;



public class TryAndCatch {
    public static void main(String[] args) {
        try {
//            throw new NullPointerException();
            throw new ClassCastException();

        } catch (ClassCastException | NullPointerException ex) {
            ex.printStackTrace();
        }
    }
}
