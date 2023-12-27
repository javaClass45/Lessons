package patterns.builder;

public class Patient {


     String name;
     String last_name;
     String first_name;
     String address;

     int age;
     int height;
     int weight;

     @Override
     public String toString() {
          return "Patient{" +
                  "name='" + name + '\'' +
                  ", last_name='" + last_name + '\'' +
                  ", first_name='" + first_name + '\'' +
                  ", address='" + address + '\'' +
                  ", age=" + age +
                  ", height=" + height +
                  ", weight=" + weight +
                  '}';
     }
}
