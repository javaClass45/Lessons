package zip;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;


public class Main {

    public static void printCheracter(char c, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(c);
        }
    }


    public static void printSeparator(int[] maxLengths) {
        System.out.print("+");
        for (int i = 0; i < 4; i++) {
            printCheracter('-', maxLengths[i]);
            System.out.print("+");
        }
        System.out.println();
    }


    private static List<ZipEntry> getZipEntries(ZipFile zipFile) {
        List<ZipEntry> zipEntries = new ArrayList<>();
        Iterator iterator = (Iterator) zipFile.entries();
        while (iterator.hasNext()) {
            ZipEntry entry = (ZipEntry) iterator.next();
            zipEntries.add(entry);
        }
        return zipEntries;
    }

    private static int[] getMaxLengths(List<ZipEntry> zipEntries) {
        int[] maxLengths = new int[4];

        maxLengths[0] = "name".length() + 2;
        maxLengths[1] = "type".length() + 2;
        maxLengths[2] = "size".length() + 2;
        maxLengths[3] = "compressed size".length() + 2;

        for (ZipEntry entry : zipEntries) {
            String name = entry.getName();
            String type = entry.isDirectory() ? "directory" : "file";
            String size = String.valueOf(entry.getSize());
            String compressedSize = String.valueOf(entry.getCompressedSize());

            maxLengths[0] = Math.max(maxLengths[0], name.length() + 2);
            maxLengths[1] = Math.max(maxLengths[1], type.length() + 2);
            maxLengths[2] = Math.max(maxLengths[2], size.length() + 2);
            maxLengths[3] = Math.max(maxLengths[3], compressedSize.length() + 2);
        }
        return maxLengths;
    }

    public static void printLine(String[] tdValues, int[] maxLangths) {
        System.out.print("|");
        for (int i = 0; i < tdValues.length; i++) {
            int sizeSpace = (maxLangths[i] - tdValues[i].length()) >> 1;
            printCheracter(' ', sizeSpace);
            System.out.print(tdValues[i]);
            printCheracter(' ', sizeSpace);
            if ((maxLangths[i] - tdValues[i].length()) % 2 != 0) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        printSeparator(maxLangths);
    }

    private static void printCaptionTable(int[] maxLengths) {
        printSeparator(maxLengths);
        String[] tdValues = new String[4];
        tdValues[0] = "name";
        tdValues[1] = "type";
        tdValues[2] = "size";
        tdValues[3] = "compressed size";
        printLine(tdValues, maxLengths);

    }


    private static void printInfoZipEntry(ZipEntry entry, int[] maxLengths) {
        String[] tdValues = new String[4];
        tdValues[0] = entry.getName();
        tdValues[1] = (entry.isDirectory()) ? "directory" : "file";
        tdValues[2] = String.valueOf(entry.getSize());
        tdValues[3] = String.valueOf(entry.getCompressedSize());

        printLine(tdValues, maxLengths);
    }



    private static File file;
    private static void printInfoZip() throws IOException {
        ZipFile zipFile = new ZipFile(file);
        List<ZipEntry> zipEntries = getZipEntries(zipFile);

        int[] maxLengths = getMaxLengths(zipEntries);
        zipFile.close();
        printCaptionTable(maxLengths);
        for (ZipEntry entry : zipEntries) {
            printInfoZipEntry(entry, maxLengths);

        }

    }
    /**
     * Функция для проверки аргументов командной строки
     * @param args аргументы командной строки
     * @return true, если мы корректно передали неообходимые аргументы,
     *  и false в противном случае
     * */

    private static boolean checkArgs(String[] args) {
        if (args.length == 0) {
            System.out.println("Введите путь к архиву");
            return false;
        }

        String pathname = args[0];
        file = new File(pathname);
        if (!file.exists()) {
            System.out.println("Файла не существует на диске");
            return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        if (checkArgs(args)) {
            printInfoZip();
        }
    }

}
