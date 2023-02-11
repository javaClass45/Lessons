package string;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class MainStringDemoMethods {

    public static void main(String[] args) throws UnsupportedEncodingException {

        appendStrBuild();

        abzac();

        substringTrim();

        abzac();

        substringLongStr();

        abzac();

        stringFormat();

        abzac();

        stringFormatDigit();

        abzac();
        int a = -1, b = 4, c = 3;
        String template;
        if (a < 0)
            template = "Warning! a = %d, b = %d, c = %d";
        else
            template = "a = %d, b = %d, c = %d";
        System.out.println(String.format(template, a, b, c) );

        abzac();
        String f = "Bender";
        StringBuilder f1 = new StringBuilder(f);

        f1.append("!!!!!!!!!!");
        //f = f1.toString();
        System.out.println(f1);

        f1.deleteCharAt(2);
        System.out.println(f1);

        f1.replace (3, 5, "_DE_");
        System.out.println(f1);

        f1.reverse();
        System.out.println(f1);

        abzac();
        String str = "Good news everyone!";
        byte[] buffer = str.getBytes();
        System.out.println(Arrays.toString(buffer));

        abzac();
        String strA = "Good news everyone!";
        Charset koi8 = Charset.forName("KOI8-R");
        byte[] bufferA = strA.getBytes(koi8);
        System.out.println(Arrays.toString(bufferA));
        abzac();
        String strB = "Good news everyone!";
        byte[] bufferB = strB.getBytes("Windows-1251");
        System.out.println(Arrays.toString(bufferB));

        abzac();

        String stst = "Good news everyone!";
        String sts = stst.replace ('o', 'a');
        //String s2 = s.replaceAll("ne", "_");
        //String s2 = s.replaceFirst("ne", "_");
        System.out.println(sts);
        abzac();


//А как преобразовать набор байт из одной кодировки в другую?
        Charset koi8r = Charset.forName("KOI8-R");
        Charset windows1251 = Charset.forName("Windows-1251");
        byte[] buf = new byte[1000];
       // InputStream.read(buf);
        String str4 = new String(buf, koi8r);
        buf = str4.getBytes(windows1251);
       // OutputStream.write(buf);








    }// psvm

    public static void stringFormatDigit() {
        String st2 = String.format("a = %d, b = %d, c = %d", 15, 24, 13);
        System.out.println(st2);
    }

    public static void stringFormat() {
        User user = new User("Viktor", 16, 10, "extra", 75);
        String text = String.format("User = {name: %s, age: %d years, friend: %d, weight: %d kg.}",
                user.getName(), user.getAge(), user.getFriends(), user.getWeight());

        System.out.println(text);
    }

    public static void substringLongStr() {
        String x = "myLongString";
        String y = x.substring(2, 6);
        String z = x.substring(0, 3);
        System.out.println("y- " + y);
        System.out.println("z- " + z);
    }

    public static void substringTrim() {
        String st = "  Good_news_everyone!  ";
        st = st.substring(1, 7).trim();
        System.out.println("trim " + st);
    }

    public static void appendStrBuild() {
        String s = "cat";
        StringBuilder s2 = new StringBuilder(s);
        s2.append("-");
        s2.append(s);
        s = s2.toString();
        System.out.println(s);
    }


    public static class User {
        private String name;
        private int age;
        private int friends;
        private String extraInformation;
        private int weight;

        public User() {
        }

        public User(String name, int age, int friends, String extraInformation, int weight) {
           this.name = name;
            this.age = age;
            this.friends = friends;
            this.extraInformation = extraInformation;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getFriends() {
            return friends;
        }

        public String getExtraInformation() {
            return extraInformation;
        }

        public int getWeight() {
            return weight;
        }
    }


    public static void abzac() {
        for (int i = 0; i < 80; i++) {
            System.out.print("=");
        }
        System.out.println("\n");
    }

}
