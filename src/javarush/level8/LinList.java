package javarush.level8;

import java.util.*;
import java.util.stream.Collectors;

public class LinList {

    public static void main(String[] args) {
        String st1 = "srfgvedg";
        String st2 = "srfgsvedg";
        String st3 = "srfgsdvedg";
        String st4 = "srfgTHTRvedg";
        String st5 = "srfSDgvedg";
        String st6 = "FDDD";


        LinkedList<String> eBio = new LinkedList<>();
        eBio.add(st1);
        eBio.add(st2);
        eBio.add(st3);
        eBio.add(st4);
        eBio.add(st5);
        eBio.add(st6);

        System.out.println(eBio);
        System.out.println("eBio.getLast() = " + eBio.getLast());

        System.out.println("/---------------------------------------------------------------------------/");
        System.out.println("/-------------как в две строки создать и заполнить LinkedList---------------/");
        System.out.println("/---------------------------------------------------------------------------/");
//-1-
        String forList = "kdjbshdb sdhfbsdhb sdjfksdjk ksefjskdfjskdjf skdjfskdfj sdkfjskdfjdfs asxtqrwt ytyweq";
        forList = forList + "dfsd fdgdfg ghfjhg jhgkjkklj i sfdf efse   gnh uykk ikyk yikiyky ";

//-2-
        LinkedList<String> listString = Arrays.stream(forList.split(" "))
                .collect(Collectors.toCollection(LinkedList::new));

        listString.forEach(x -> System.out.print(x + " "));

        listString.addFirst(null);

        System.out.println("\n");
        for (String s : listString) {
            Optional<String> opt = Optional.ofNullable(s);
            System.out.println(opt.orElse("!!!!!!!!!!! нашли null !!!!!!!!!!!!"));

        }

        System.out.println("\n");

        LinkedList<String> sortedList = listString.stream().filter(x -> x!=null) // отигнорили null в листе
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toCollection(LinkedList::new));

        sortedList.forEach(System.out::println);


    }
}
