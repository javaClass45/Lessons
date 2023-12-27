package io.javafilespath;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ReadWrite {

    public static void main(String[] args) throws IOException {


        readFileLinesOne();

        String file = "d:/j1/text.txt";
        List<String> strings = Files.readAllLines(Paths.get(file));
        for (String s: strings) {
            System.out.println(s);
        }


    }

    private static void readFileLinesOne() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("d:/j1/ReadWrite.txt"), UTF_8);

        for (String s: lines) {
            System.out.println(s);
        }
    }

}
