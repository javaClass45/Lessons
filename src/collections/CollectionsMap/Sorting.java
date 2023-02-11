package collections.CollectionsMap;

import javax.swing.*;
import java.util.*;


public class Sorting {
    public static void main(String[] args) {

        Integer[] array = new Integer[]{23, 15, 26, 35, 48, 57, 59, 65, 45, 12, 38, 19, 17, 46, 83};
        Arrays.sort(array, Comparator.reverseOrder());
        System.out.println(Arrays.toString(array));


        Map<Integer, String> name = new HashMap<>();
        name.put(4, "Nikolaus");
        name.put(13, "Pjetro");
        name.put(1, "Sergej");
        name.put(6, "Anton");
        name.put(8, "Mortishia");
        name.put(2, "Oleg");


        Comparator<Map<Integer, String>> comp = (o1, o2) -> 0;

        name.forEach((k, v) -> System.out.println(k + " <-\t-> " + v));


        name.forEach((k, v) -> System.out.println(k + "\t" + v));

        name.forEach((k, v) -> System.out.println(v = k == 2 ? v + "-two" : v + "-" + k));



        Integer kk = 2;

        name.forEach((k, v) -> name.put(kk, "VICTORIA-TWO"));
        List<String> listStr = new ArrayList<>();

        name.forEach((k, v) -> listStr.add(v));

        name.forEach((k, v) -> System.out.printf("Ключ: %d; Значение: %s \n", k, v));

       // listStr.stream().sorted();

        listStr.stream().sorted().forEach(System.out::println);
        
        JOptionPane.showOptionDialog(null, "обжект сообщение",
                "tyt nazvanie", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, null, null);

        try {
            int df = 3 / 0;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,
                    "Пожалуйста, введите число", "Неправильный ввод",
                    JOptionPane.PLAIN_MESSAGE);
        }

//        for (Map.Entry<Integer, String> entry : name.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//
//        }
//
//        String[] eName = new String[name.size()];
//
//        Map<Integer, String> treeMap = new TreeMap<>();
//        treeMap.putAll(name);
//
//        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
//            System.out.printf("\n Ключ: %d; Значение: %s \n",
//                    entry.getKey(), entry.getValue());
//
//        }


    }//psvm






}
