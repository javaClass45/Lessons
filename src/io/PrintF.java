package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintF {

    private static final String GREETINGS_MESSAGE = "My name is %s, my age is %d!";

    public static void main(String[] args) throws IOException {

        PrintStream printStream = new PrintStream("D:/j1/R2D2.txt");

        printStream.println("Hello!");
        printStream.println("We are robots!");

        printStream.printf(GREETINGS_MESSAGE, "Amigo", 18);
        printStream.println();
        printStream.printf(GREETINGS_MESSAGE, "R2-D2", 35);
        printStream.println();
        printStream.printf(GREETINGS_MESSAGE, "C-3PO", 35);

        printStream.close();


        try (Scanner scanner = new Scanner(new File("d:/j1/R2D2.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }



    }
}
