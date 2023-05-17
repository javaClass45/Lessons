package lambdaStream.Lesson6;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {
        for (int i = 2; i < 23; i+=2) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println(Stream
                .iterate(2, n -> n+=2)
                .limit(11)
                .collect(Collectors.toList()));

    }

}
