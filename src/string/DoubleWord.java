package string;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//найти повторяющиеся слова, посчитать сколько раз они встречаются в тексте

public class DoubleWord {

    public void searchDoubleWord() {
        String str = "на! Java Абстрактные -   классы в   java на, конкретных  примерах. пока-пока  Java";
        String[] arr = str.trim().toLowerCase().replaceAll("[^\\p{L}]+", " ").split(" ");
        System.out.println(Arrays.toString(arr));
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                    list.remove(j);
                }
            }
//            System.out.println("count = " + count);
            if (count > 1) map.put(list.get(i), count);
        }

        list.forEach(x -> System.out.print(x + " "));
        System.out.println();

        map.entrySet().stream().filter(m -> m.getValue() > 1).forEach(System.out::println);



    }

//  "d:/j1/text.txt"
    public void searchDoubleWordFromFile(String filePath) {

        String[] arr = new String[0];
        try {
            arr = inputSting(filePath)
                    .trim()
                    .toLowerCase()
                    .replaceAll("[^\\p{L}]+", " ")
                    .split(" ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(arr));
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                    list.remove(j);
                }
            }
//            System.out.println("count = " + count);
            if (count > 1) map.put(list.get(i), count);
        }

        list.forEach(x -> System.out.print(x + " "));
        System.out.println();

        map.entrySet().stream().filter(m -> m.getValue() > 1).forEach(System.out::println);



    }



    public static String inputSting(String s) throws FileNotFoundException {
        File file = new File(s);
        Scanner scanner = new Scanner(file);
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNext()) {
            sb.append(scanner.nextLine());
        }
        scanner.close();
        return String.valueOf(sb);
    }

}

