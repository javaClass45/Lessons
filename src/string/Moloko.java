package string;

public class Moloko {
    public static void main(String[] args) {
        System.out.println("---------------");
        System.out.print("\n\n\n");
        System.out.println("---------------");

        String moloko1 = "moloko";
        String moloko4 = "moloko";
        String mo = "mo";
        String loko = "loko";
        String moloko2 = mo+loko;
        String moloko3 = "mo"+"loko";
        String mlko = new String("moloko");

        System.out.println("moloko1.equals(moloko2) = " + (moloko1.equals(moloko2)));//true
        System.out.println("moloko1.equals(moloko3) = " + (moloko1.equals(moloko3)));//true
        System.out.println("moloko1.equals(mlko) = " + (moloko1.equals(mlko)));//true
        System.out.println("moloko1.equals(mlko) = " + (moloko1.equals(mlko.intern())));//true


        System.out.println("moloko1==moloko2 = " + (moloko1 == moloko2));           //false
        System.out.println("moloko1==moloko4 = " + (moloko1 == moloko4));           //true
        System.out.println("moloko1==moloko3 = " + (moloko1 == moloko3));           //true
        System.out.println("moloko2==moloko3 = " + (moloko2 == moloko3));            //false
        System.out.println("moloko1==mlko = " + (moloko1 == mlko));                 //false
        System.out.println("moloko1==mlko.intern() = " + (moloko1 == mlko.intern()));//true




    }



}
