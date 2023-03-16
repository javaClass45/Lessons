package io.javafilespath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class JavaFilesPath {
    public static void main(String[] args) throws IOException {
        Path testFilePath = Paths.get("d:/j1/text.txt");

        Path fileName = testFilePath.getFileName();
        System.out.println("chapter 1)");
        System.out.println(fileName);

        Path parent = testFilePath.getParent();
        System.out.println("chapter 2)");
        System.out.println(parent);

        Path root = testFilePath.getRoot();
        System.out.println("chapter 3)");
        System.out.println(root);

        boolean endWithTxt = testFilePath.endsWith("j1/text.txt");
        System.out.println("chapter 4)");
        System.out.println(endWithTxt);

        boolean startsWithLalala = testFilePath.startsWith("lalalala");
        System.out.println("chapter 5)");
        System.out.println(startsWithLalala);


        Path path5 = Paths.get("C:\\Users\\Java\\.\\examples");

        System.out.println("path5.normalize() = " + path5.normalize());

        Path path6 = Paths.get("C:\\Users\\Java\\..\\examples");
        System.out.println("path6.normalize() = " + path6.normalize());

        System.out.print("relativize()   ");
        Path testFilePath1 = Paths.get("C:\\Users\\Users\\Users\\Users");
        Path testFilePath2 = Paths.get("C:\\Users\\Users\\Users\\Users\\Username\\Desktop\\testFile.txt");

        System.out.println(testFilePath1.relativize(testFilePath2));

        System.out.println("---------------------------------- Files --------------------------------------");


        //создание файла
        Path testFile1 = Files.createFile(Paths.get("C:\\Users\\Username\\Desktop\\testFile111.txt"));
        System.out.println("Был ли файл успешно создан?");
        System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testFile111.txt")));

        //создание директории
        Path testDirectory = Files.createDirectory(Paths.get("C:\\Users\\Username\\Desktop\\testDirectory"));
        System.out.println("Была ли директория успешно создана?");
        System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testDirectory")));

        //перемещаем файл с рабочего стола в директорию testDirectory. Перемещать надо с указанием имени файла в папке!
        testFile1 = Files.move(testFile1, Paths.get("C:\\Users\\Username\\Desktop\\testDirectory\\testFile111.txt"), REPLACE_EXISTING);

        System.out.println("Остался ли наш файл на рабочем столе?");
        System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testFile111.txt")));

        System.out.println("Был ли наш файл перемещен в testDirectory?");
        System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testDirectory\\testFile111.txt")));

        //удаление файла
        Files.delete(testFile1);
        System.out.println("Файл все еще существует?");
        System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testDirectory\\testFile111.txt")));



        //создание файла
        Path testFile2 = Files.createFile(Paths.get("C:\\Users\\Username\\Desktop\\testFile112.txt"));
        System.out.println("Был ли файл успешно создан?");
        System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testFile112.txt")));

        //создание директории
        Path testDirectory2 = Files.createDirectory(Paths.get("C:\\Users\\Username\\Desktop\\testDirectory2"));
        System.out.println("Была ли директория успешно создана?");
        System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testDirectory2")));

        //копируем файл с рабочего стола в директорию testDirectory2.
        testFile2 = Files.copy(testFile2, Paths.get("C:\\Users\\Username\\Desktop\\testDirectory2\\testFile112.txt"), REPLACE_EXISTING);

        System.out.println("Остался ли наш файл на рабочем столе?");
        System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testFile1121.txt")));

        System.out.println("Был ли наш файл скопирован в testDirectory?");
        System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testDirectory2\\testFile112.txt")));




    }

}
