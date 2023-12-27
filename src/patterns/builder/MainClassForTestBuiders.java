package patterns.builder;

public class MainClassForTestBuiders {

    public static void main(String[] args) {

        Patient bart = new PatientBuitImpl()
                .setName("Bart")
                .setLast_name("Simpson")
                .setAge(15)
                .build();

        System.out.println("bart = " + bart.toString());


        Patient morty = new PatientBuitImpl()
                .setName("Morty")
                .setAge(70)
                .setHeight(180)
                .setWeight(90)
                .build();

        System.out.println("morty = " + morty);
    }
}
