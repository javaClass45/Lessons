package interview.task113;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String str = "Привет, привет, пока, пока, до скорого, пока-пока,   привет ";
        String[] arr = str.trim().toLowerCase().replaceAll(",", "").split(" ");

        System.out.println(Arrays.toString(arr));

        Map<String, Integer> mapa = new HashMap<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (String word : arr) {
                if (arr[i].equals(word)) count++;
            }
            mapa.put(arr[i], count);
           // System.out.println("put " + arr[i] + " i=" + i);
            count = 0;
        }
//        for (Map.Entry<String, Integer> map : mapa.entrySet()) {
//          if(map.getValue() > 1) System.out.println(map.getKey() + " = " + map.getValue());
//        }

        mapa.entrySet().stream().filter(m -> m.getValue() > 1).forEach(System.out::println);

    }
}
