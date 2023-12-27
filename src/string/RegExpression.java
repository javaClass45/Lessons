package string;

/*
*  + - один и более
*  * - ноль и более
*  ? - 0 или 1 символов до него
*  (x|y|z) -  какой-либо из указанных символов
*  (xxx)|(yyy)|(zzz) -  какое-либо из указанных выражений
* */

public class RegExpression {
    private static final String DIGIT = "\\d";// одна цифра
    private static final String MYONE = "\\s+[А-Я]+\\s+";
    private static final String MYTWO = "\\W+\\d+\\.\\s";

    public static void main(String[] args) {

//        extracted();
        String line = "     ЯСНОСТЬ                 ";
        String lineTwo = "     13000. ";

        System.out.println("line.matches(MYONE) = " + line.matches(MYONE));
        System.out.println("lineTwo.matches(MYTWO) = " + lineTwo.matches(MYTWO));
    }



    private static void extracted() {
        String line = "digit";

        System.out.println("line.matches(DIGIT) = " + line.matches(DIGIT));
        System.out.println("line.compareTo(DIGIT) = " + line.compareTo(DIGIT));
        System.out.println("line.equals(DIGIT) = " + line.equals(DIGIT));
        System.out.println("(line == DIGIT) = " + (line == DIGIT));
    }

}
