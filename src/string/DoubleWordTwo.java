package string;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//найти повторяющиеся слова, посчитать сколько раз они встречаются в тексте

/*план такой
* средствами String и регулярных выражений разбить строку на массив слов
* без заглавных букв. Массив сделать List. Создать HashMap. В ForEach список прогнать
*  через  stream  и посчитать солько раз встречается каждый элемент списка, в этом же
* цикле в мапу положить слово:число
* вывести в консоль элементы мапы с value > 1.
* */


public class DoubleWordTwo {

    public void doubleWordTwoInFile(String pathFile) {
        String str = null; //  "d:/j1/test.txt"
        try {
            str = inputSting(pathFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String[] arr = str.trim()
                .toLowerCase()
                .replaceAll("[^\\p{L}]+", " ")
                .split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        Map<String, Long> map = new HashMap<>();
        long num = 0;
        for (String s : list) {
            num = list.stream().filter(s::equals).count();
            map.put(s, num);
        }

        map.entrySet()
                .stream()
                .filter(m -> m.getValue() > 1)
                .forEach(System.out::println);

        System.out.println("map.size() = " + map.size());
//
//        for (Map.Entry<String, Long> entry : map.entrySet()) {
//            if(entry.getValue() > 1) System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

    }



    public static String inputSting(String s) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(s));
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNext()) {
            sb.append(scanner.nextLine());
        }
        scanner.close();
        return String.valueOf(sb);
    }

}

