package io.javafilespath;

import java.io.IOException;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ReadWrite {

    public static void main(String[] args) throws IOException {


        List<String> lines = Files.readAllLines(Paths.get("d:/j1/ReadWrite.txt"), UTF_8);

        for (String s: lines) {
            System.out.println(s);
        }
    }

}
