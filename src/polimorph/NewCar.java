package polimorph;

import java.util.ArrayList;
import java.util.HashMap;

public class NewCar  {

    public NewCar() {
        AbsClass.print();
    }

    public ArrayList<NewCar> createPoliceCars(int count) {

            ArrayList<NewCar> result = new ArrayList<NewCar>();

            for(int i=0; i<count; i++) {

                final int number = i;
                result.add(new NewCar() {

                    int policeNumber = number;
                });

            }
            return result;



        }


    public abstract static class AbsClass {
           public static String stroka = "AbsClass";
           public static void print() {
               System.out.println(stroka);
           }

    }

    public static void main(String[] args) {

    }


}

