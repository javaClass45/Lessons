package collections.iterations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LessonComparator {


    public static void main(String[] args) {
//        Строку сплитить и делать List<String>, тогда не придется городить огород с getListCharacters()
//        for example: /javarush/level/LinList;
        List<Character> list = getListCharacters("ksajcniuedioqw7438967f9sdabnjcvcv8o7238csa@!##^^");
        list.forEach(System.out::print);

        System.out.println("\n--------->>>-----------");
        list.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                if (o1 > o2) return 1;
                if (o1 < o2) return -1;
                return 0;
            }
        });
        System.out.println(list.toString());

        System.out.println("\n---------<<<-----------");
        list.sort((o1, o2) -> o2 - o1);
        list.forEach(x -> System.out.print(x + ","));


    }

    public static List<Character> getListCharacters(String str) {
        Character[] chars = new Character[str.toCharArray().length];
        int i = 0;
        for (char ch : str.toCharArray()) {
            chars[i++] = ch;
        }
        return new ArrayList<>(List.of(chars));
    }


}
