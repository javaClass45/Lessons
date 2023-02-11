package string;

/*
*  + - один и более
*  * - ноль и более
*  ? - 0 или 1 символов до него
*  (x|y|z) -  какой-либо из указанных символов
*
* */

public class RegExpression {
    private static final String DIGIT = "\\d";// одна цифра

    public static void main(String[] args) {

        String line = "digit";

        System.out.println("line.matches(DIGIT) = " + line.matches(DIGIT));
        System.out.println("line.compareTo(DIGIT) = " + line.compareTo(DIGIT));
        System.out.println("line.equals(DIGIT) = " + line.equals(DIGIT));
        System.out.println("(line == DIGIT) = " + (line == DIGIT));


    }

}
