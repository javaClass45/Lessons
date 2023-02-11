package collections.CollectionsMap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CollectionsMap {

    public static void main(String[] args) throws IOException {

        File file = new File("d:/j1/result.txt");

        // Создание файла
        file.createNewFile();

        // Создание объекта FileWriter
        FileWriter writer = new FileWriter(file);


        FileInputStream inputStream = new FileInputStream("d:/j1/07.csv");
        int length = inputStream.available();
        byte[] data = new byte[length];
        inputStream.read(data);

        String text = new String(data, "windows-1251");
//         System.out.println(text);

        List<String[]> listWord = new ArrayList<>();
        String[] lines = text.split("\\n");
        for (String s : lines) {
//            System.out.println(s);
//            System.out.println("---------------------------------------------------------");
            String[] words = s.split(";");
            listWord.add(words);

        }

        for (String[] strings : listWord) {
            //  Arrays.stream(strings).forEach(System.out::println);
            if (strings[12].equals("amount")) continue;
            if (Double.parseDouble(strings[12].replace(",", ".")) > 50000) {

                //   System.out.println(Double.parseDouble(strings[12].replace(",",".")));
                for (String word : strings) {
                    // Запись содержимого в файл
                    writer.write(word + " | ");

                }
                writer.write("\\n");
            }
        } //if



        writer.flush();
        writer.close();

    }

}


