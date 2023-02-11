package collections.iterations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparator {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person(4, "Gashek"));
        people.add(new Person(2, "Shveik"));
        people.add(new Person(1, "Leolik"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() > o2.getId()) return 1;
                if (o1.getId() < o2.getId()) return -1;
                return 0;
            }
        });
        people.forEach(System.out::println);

        people.sort(Comparator.comparing(Person::getName));
        people.forEach(System.out::println);

    }

}


