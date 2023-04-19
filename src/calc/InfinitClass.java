package calc;

public class InfinitClass {
    public static void main(String[] args) {

        System.out.println("1.0/0.0= " + 1.0/0.0);
        double inf = Double.POSITIVE_INFINITY;
        System.out.println(inf); // Бесконечность
        System.out.println(inf + 1); //Бесконечность+1 ==Бесконечность
        System.out.println(inf + 10); //Бесконечность+10 ==Бесконечность
        System.out.println(inf * -1); //равно «минус бесконечность»
        System.out.println("Double.NEGATIVE_INFINITY = " + Double.NEGATIVE_INFINITY);
        System.out.println("inf * inf = " + (inf * inf));
    }
}
