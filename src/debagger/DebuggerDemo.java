package debagger;

import java.util.Scanner;

public class DebuggerDemo {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            Integer multiplicaion = multiply();
            if (multiplicaion >= 100) {
                System.out.println("multiplicaion >= 100");
            } else {
                System.out.println("multiplicaion less then 100");
            }
        }

    }

    private static Integer multiply() {
        System.out.println("Enter first number: ");
        var firstNumber = SCANNER.nextInt();
        System.out.println("Enter second number: ");
        var secondNumber = SCANNER.nextInt();
        return firstNumber * secondNumber;
    }
}
