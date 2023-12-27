package randomise;

public class rndInt {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("rndInt(4) = " + rndInt(4));
        }


    }
    private static int rndInt(int quantityOfQuote) {

        return (int) Math.ceil(Math.random() * quantityOfQuote) ;
    }
}
