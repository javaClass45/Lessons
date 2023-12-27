package fileTextToBD;




import java.io.*;

import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;


public class TextToBD {
    private static final String REGEXP = "\\s+[А-Я]+";
    private static final String REGEXPTWO = "\\s+[А-Я]+\\s\\([а-я]+\\)";
    private static final String PATTERN = "\\W+\\d+\\.\\s";
    private static final String FILEREAD = "D:\\j1\\12k.txt";
    private static final String FILEWRITE = "D:\\j1\\one12kOK.txt";
    private static List<String> text12k = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        methodOne();
        methodTwo();
    }

    private static void methodTwo() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILEWRITE));
        for (String str : text12k) {
            writer.append("\n");
            writer.write(str);
        }
        writer.close();
    }

    private static void methodOne() throws IOException {
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(FILEREAD, StandardCharsets.UTF_8));
        while ((line = reader.readLine()) != null) {
            if (line.matches(REGEXP)||line.matches(REGEXPTWO)) {
                continue;
            }
            line = line.replaceAll(PATTERN, "");
            text12k.add(line);
        }
        reader.close();

//        for (String s : text12k) {
//            System.out.println(s);
//        }
    }


}
