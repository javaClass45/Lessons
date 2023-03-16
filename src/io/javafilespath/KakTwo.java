package io.javafilespath;

import java.io.IOException;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KakTwo {
    public static void main(String[] args) {

        Stream<String> stream = null;
        try {
            stream = Files.lines(Paths.get("d:/j1/ReadWrite.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> result  = stream
                .filter(line -> line.startsWith("Но"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        result.forEach(System.out::println);

    }
}
