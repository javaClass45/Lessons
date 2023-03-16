package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanLineFile {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(new File("d:/j1/test.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }


    }
}
