package polimorph;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        SuperClass descendantOne = new DescendantOne();
        SuperClass descendantTwo = new DescendantTwo();
        SuperClass descendantThree = new DescendantThree();




        List<SuperClass> list = Arrays.asList(descendantOne, descendantTwo, descendantThree);

        for (SuperClass superClass : list) {
            superClass.method();
             superClass.method("print");
        }


    }
}
