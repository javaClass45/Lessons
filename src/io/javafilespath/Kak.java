package io.javafilespath;

import java.io.IOException;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Kak {

    public static void main(String[] args) {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get("d:/j1/ReadWrite.txt"), UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> result = new ArrayList<>();

        for (String s: lines) {
            if (s.startsWith("Мы")) {
                String upper = s.toUpperCase();
                result.add(upper);
            }
        }

        for (String s: result) {
            System.out.println(s);
        }
    }

}
