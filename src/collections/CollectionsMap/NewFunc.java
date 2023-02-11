package collections.CollectionsMap;

import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.JapaneseDate;
import java.util.AbstractList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

public class NewFunc extends AbstractList<String> implements List<String> {


    public static void main(String[] args) {
        NewFunc newFunc = new NewFunc();


        Map<String, Integer> authorsToAge
                = Map.ofEntries(entry("Raoul", 23),
                entry("Mario", 40),
                entry("Alan", 53));


        authorsToAge.forEach((k, v) -> System.out.println(k + "\t" + v));


        var myMap = new HashMap<String, List<String>>();

        LocalDate date = LocalDate.of(2022, Month.JULY, 20);
        JapaneseDate japaneseDate = JapaneseDate.from(date);
        System.out.println(japaneseDate);

    }

    /**
     * {@inheritDoc}
     *
     * @param index
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
