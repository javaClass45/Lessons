package io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
/*
 * как получить список всех файлов в папке на Java
 */

public class ListFiles {

    public static void main(String[] args) {

//        method one -- Отображение всех файлов и папок основной дирректории
        File currentDir = new File("d:/j1");
        displayAllFilesDirectories(currentDir);

//        method two -- list files, directory, and files in the directories

        try {
            dir("d:/j1");
        } catch (IOException e) {
            e.printStackTrace();
        }

//        method three   -- list only files

        filelist("d:/j1");



    }
// list only files
    private static void filelist(String path) {
        File dir = new File(path); //path указывает на директорию
        List<File> lst = new ArrayList<>();
        for ( File file : dir.listFiles() ){
            if ( file.isFile() )
                lst.add(file);
        }

        lst.forEach(s -> System.out.print(s + "\n"));

    }

    private static void dir(String directory) throws IOException {
        List<Path> list = Files.walk(Paths.get(directory))
                .filter(Files::isRegularFile)
                .collect(Collectors.toList());

        list.forEach(s -> System.out.print(s + "\n"));

    }

    // Отображение всех файлов и папок основной дирректории
    public static void displayAllFilesDirectories(File dir) {
        try {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("directory: " + file.getCanonicalPath());
                    // Вывести файлы подкаталогов, ежели нужно: displayAllFilesDirectories(file);
                } else {

                    // Форматирование даты изменения файла с миллисекунд на адекватную
                    long lastModified = file.lastModified();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

                    System.out.println("     file: " + file.getCanonicalPath()
                            + ", размер файла: " + file.length()
                            + " byte, дата изменения: " + sdf.format(new Date(lastModified)));

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
