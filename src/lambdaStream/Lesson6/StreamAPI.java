package lambdaStream.Lesson6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {
        Random rnd = new Random();

        for (int i = 2; i < 23; i+=2) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println(Stream
                .iterate(2, n -> n+=2)
                .limit(11)
                .collect(Collectors.toList()));


        Stream<Integer> integerStream = Stream
                .iterate(2, n -> n+=2)
                .limit(11);

         integerStream
                 .sorted(Comparator.reverseOrder())
                 .forEach(e -> System.out.print(e + " "));


//         достать 7 самых больших чисел из массива
        Integer[] array = new Integer[40];
        for (int i = 0; i < 40; i++) {
            array[i] = rnd.nextInt(10000);
        }
        System.out.println("\n" + " достать 7 самых больших чисел из массива");
        Arrays.sort(array, Comparator.reverseOrder());
        for (int i = 0; i < 7; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println("\n");
        System.out.print(
                Arrays.stream(array).sorted(Comparator.reverseOrder())
                .limit(7)
                .collect(Collectors.toList())
        );


    }

}
