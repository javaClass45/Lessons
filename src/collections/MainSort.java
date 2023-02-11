package collections;

import java.util.*;
import java.util.stream.Collectors;

import static collections.CarList.printHello;

public class MainSort {


    public static void main(String[] args) {
        Object object = new Object();

        List<String> list = new ArrayList<>();


        ArrayList<String> arrayList = new ArrayList<>();

        CarArrayList carArrayList = new CarArrayList();
        System.out.println("printHello() = " + printHello()); //  пример import static collections.CarList.printHello;

        Map<String, Integer> map = Map.of("one",1,
                "two",2,
                "three",3,
                "five",5,
                "four",4,
                "six",6,
                "eight",8,
                "nine",9,
                "seven",7,
                "ten - is max of the .OF",10
//                "eleven",11
                );
        map.forEach((k,v) -> {System.out.println("Key = "+k+", Value = "+v);});
        System.out.println("\n");
        System.out.println("\n");

        SortedMap<String, Integer> sortedMap = new TreeMap();
        sortedMap.putAll(map);

        System.out.println("sortedMap:");
        sortedMap.forEach((k,v) -> {System.out.println("Key = "+k+", Value = "+v);});
        System.out.println("\n"+"ForEach Map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key() = " + entry.getKey() + ":" +"Val = " + entry.getValue());
        }


        // sort by key "a,b,c,d,..."
        Map<String, Integer> resultK = map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println("\n");
        resultK.forEach((k,v) -> {System.out.println("Key = "+k+", Value = "+v);});

        //sort by values, and reserve it, 10,9,8,7,6...
        Map<String, Integer> resultV = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println("\n");
        resultV.forEach((k,v) -> {System.out.println("Key = "+k+", Value = "+v);});

        //sort by values, and reserve it, 1,2,3,4,5...
        Map<String, Integer> resultVN = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println("\n");
        resultVN.forEach((k,v) -> {System.out.println("Key = "+k+", Value = "+v);});


    }


}