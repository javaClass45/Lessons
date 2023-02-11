package string;

public class Main {


    public static void main(String[] args) {

        System.out.println("Amount");
        Amount amount = new Amount();
        amount.amountMetohod();

        System.out.println("\n" + "DoubleWord");
        DoubleWord doubleWord = new DoubleWord();
        doubleWord.searchDoubleWord();
        doubleWord.searchDoubleWordFromFile("d:/j1/f3.txt");


        System.out.println("\n" + "DoubleWordTwo");
        DoubleWordTwo doubleWordTwo = new DoubleWordTwo();
        doubleWordTwo.doubleWordTwoInFile("d:/j1/f3.txt");

        System.out.println("\n" + "MyString");
        MyString myString = new MyString();
        myString.myString();

        System.out.println("\n" + "Palindrome");
        Palindrom palindrom = new Palindrom();
        palindrom.palindrom();

        System.out.println("\n" + "PalindromeSB-revers");
        PalindromSB palindromSB = new PalindromSB();
        palindromSB.seversStrBuilder();

    }

}
