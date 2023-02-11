package collections.iterations;

import java.util.*;

public class MyComparable {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        Set<Person> personSet = new TreeSet<>();
        addElements(personList);
        addElements(personSet);

        Collections.sort(personList);


        personList.forEach(System.out::println);
        personSet.forEach(System.out::println);

    }


    private static void addElements(Collection<Person> collection) {
        collection.add(new Person(1, "Sasa"));
        collection.add(new Person(6, "Vasia"));
        collection.add(new Person(3, "Vova"));
        collection.add(new Person(5, "Luda"));
        collection.add(new Person(4, "Dasha"));
        collection.add(new Person(2, "Zina"));
    }
}
