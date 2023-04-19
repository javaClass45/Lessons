package optional;

import java.util.Optional;

public class LessonOneOpt {
    public static void main(String[] args) {


        Optional<String> optional = Optional.of("hello");
        System.out.println("optional.isPresent() = " + optional.isPresent());
        optional.ifPresent(s -> System.out.println(s.length())); // 5
        System.out.println("optional.get() = " + optional.get());

        String[] strings = new String[3];
        Optional<String> opt = Optional.ofNullable(strings[2]);
        System.out.println(opt.orElse("ops... strings[2] = NULL"));

    }
}
